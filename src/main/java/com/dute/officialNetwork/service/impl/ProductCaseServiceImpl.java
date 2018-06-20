package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.ProductCaseRepository;
import com.dute.officialNetwork.service.ProductCaseService;

@Service
public class ProductCaseServiceImpl implements ProductCaseService {

	@Autowired
	private ProductCaseRepository pcr;
}
