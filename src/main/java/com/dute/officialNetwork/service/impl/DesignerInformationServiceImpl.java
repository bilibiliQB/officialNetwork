package com.dute.officialNetwork.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.DesignerInformation;
import com.dute.officialNetwork.domain.repository.DesignerInformationRepository;
import com.dute.officialNetwork.service.DesignerInformationService;

@Service
public class DesignerInformationServiceImpl implements DesignerInformationService {

	@Autowired
	private DesignerInformationRepository dir;

	@Override
	public List<DesignerInformation> get5DesignerInformations() {
		return dir.findTop5ByOrderByCreateTimeDesc();
	}
}
