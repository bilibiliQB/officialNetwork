package com.dute.officialNetwork.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.dute.officialNetwork.api.po.DesignerInformationPo;
import com.dute.officialNetwork.api.po.ProductCasePo;
import com.dute.officialNetwork.domain.entity.DesignerInformation;
import com.dute.officialNetwork.domain.entity.ProductCase;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.DesignerInformationRepository;
import com.dute.officialNetwork.service.interfaces.DesignerInformationService;

@Service
public class DesignerInformationServiceImpl implements DesignerInformationService {

	@Autowired
	private DesignerInformationRepository dir;

	@Override
	public List<DesignerInformationPo> get5DesignerInformations() {
		List<DesignerInformationPo> list = new ArrayList<>();
		for(DesignerInformation designerInformation : dir.findTop6ByOrderByCreateTimeDesc()){
			DesignerInformationPo designerInformationPo = new DesignerInformationPo();
			BeanUtils.copyProperties(designerInformation,designerInformationPo);
			list.add(designerInformationPo);
		}
		return list;
	}
}
