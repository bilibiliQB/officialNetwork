package com.dute.officialNetwork.service.impl;

import com.dute.officialNetwork.api.response.decoration.DecorationClassMainTypeResponse;
import com.dute.officialNetwork.api.response.decoration.DecorationClassSubTypeResponse;
import com.dute.officialNetwork.domain.entity.DecorationClassMainType;
import com.dute.officialNetwork.domain.entity.DecorationClassSubType;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.DecorationClassMainTypeRepository;
import com.dute.officialNetwork.service.interfaces.DecorationClassMainTypeService;

import java.util.List;

@Service
public class DecorationClassMainTypeServiceImpl implements DecorationClassMainTypeService {

	@Autowired
	@SuppressWarnings("unused")
	private DecorationClassMainTypeRepository decorationClassMainTypeRepository;

	@Override
	public List<DecorationClassMainTypeResponse> findAll() {
        List<DecorationClassMainType> typeRepositoryAll = decorationClassMainTypeRepository.findAll();
        List<DecorationClassMainTypeResponse> decorationClassMainTypeResponseList = Lists.newArrayList();
        for (DecorationClassMainType decorationClassMainType : typeRepositoryAll) {
            DecorationClassMainTypeResponse decorationClassMainTypeResponse = new DecorationClassMainTypeResponse();
            List<DecorationClassSubType> decorationClassSubTypes = decorationClassMainType.getDecorationClassSubTypes();
            List<DecorationClassSubTypeResponse> decorationClassSubTypeResponseList = Lists.newArrayList();
            for (DecorationClassSubType decorationClassSubType : decorationClassSubTypes) {
                DecorationClassSubTypeResponse decorationClassSubTypeResponse = new DecorationClassSubTypeResponse();
                decorationClassSubTypeResponse.setSubTypeName(decorationClassSubType.getName());
                decorationClassSubTypeResponse.setSubTypeId(decorationClassSubType.getId());
                decorationClassSubTypeResponseList.add(decorationClassSubTypeResponse);
            }
            decorationClassMainTypeResponse.setMainTypeName(decorationClassMainType.getName());
            decorationClassMainTypeResponse.setDecorationClassSubTypeResponseList(decorationClassSubTypeResponseList);
            decorationClassMainTypeResponseList.add(decorationClassMainTypeResponse);
        }
        return decorationClassMainTypeResponseList;
    }
}
