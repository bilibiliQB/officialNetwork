package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.ProductCaseTypeRepository;
import com.dute.officialNetwork.service.ProductCaseTypeService;

@Service
public class ProductCaseTypeServiceImpl implements ProductCaseTypeService {

	@Autowired
	private ProductCaseTypeRepository pctr;
}
