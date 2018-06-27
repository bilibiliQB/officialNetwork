package com.dute.officialNetwork.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.DecorationClassSubType;
import com.dute.officialNetwork.domain.repository.DecorationClassSubTypeRepository;
import com.dute.officialNetwork.service.interfaces.DecorationClassSubTypeService;

@Service
public class DecorationClassSubTypeServiceImpl implements DecorationClassSubTypeService {

	@Autowired
	private DecorationClassSubTypeRepository dcstr;

	@Override
	public List<DecorationClassSubType> findByDecorationClassMainType_Id(Integer dcm_id) {
		return dcstr.findByDecorationClassMainType_IdOrderByCreateTime(dcm_id);
	}
}
