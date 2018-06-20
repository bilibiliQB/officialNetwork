package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.ProductCaseStructureRepository;
import com.dute.officialNetwork.service.ProductCaseStructureService;

@Service
public class ProductCaseStructureServiceImpl implements ProductCaseStructureService {

	@Autowired
	private ProductCaseStructureRepository pcsr;
}
