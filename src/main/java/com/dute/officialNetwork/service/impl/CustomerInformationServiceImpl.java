package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.CustomerInformation;
import com.dute.officialNetwork.domain.repository.CustomerInformationRepository;
import com.dute.officialNetwork.service.CustomerInformationService;

@Service
public class CustomerInformationServiceImpl implements CustomerInformationService {

	@Autowired
	private CustomerInformationRepository cir;

	@Override
	public Long save(CustomerInformation ci) {
		if (cir.save(ci) != null) {
			return cir.save(ci).getId();
		}
		return null;
	}

}
