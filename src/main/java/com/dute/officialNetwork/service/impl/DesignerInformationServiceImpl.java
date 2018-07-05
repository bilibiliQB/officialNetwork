package com.dute.officialNetwork.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.DesignerInformation;
import com.dute.officialNetwork.domain.repository.DesignerInformationRepository;
import com.dute.officialNetwork.service.interfaces.DesignerInformationService;

@Service
public class DesignerInformationServiceImpl implements DesignerInformationService {

	@Autowired
	private DesignerInformationRepository dir;

	@Override
	@Cacheable("ListDesignerInformationAll#1d")
	public List<DesignerInformation> get5DesignerInformations() {
		return dir.findTop5ByOrderByCreateTimeDesc();
	}
}
