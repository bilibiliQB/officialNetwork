package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.DesignerInformationRepository;
import com.dute.officialNetwork.service.DesignerInformationService;

@Service
public class DesignerInformationServiceImpl implements DesignerInformationService {

	@Autowired
	private DesignerInformationRepository dir;
}
