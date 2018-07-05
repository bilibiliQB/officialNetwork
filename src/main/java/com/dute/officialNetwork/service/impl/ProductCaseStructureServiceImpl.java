package com.dute.officialNetwork.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.ProductCaseStructure;
import com.dute.officialNetwork.domain.repository.ProductCaseStructureRepository;
import com.dute.officialNetwork.service.interfaces.ProductCaseStructureService;

@Service
public class ProductCaseStructureServiceImpl implements ProductCaseStructureService {

	@Autowired
	private ProductCaseStructureRepository pcsr;

	@Override
	@Cacheable("ListProductCaseStructureAll#1d")
	public List<ProductCaseStructure> getAll() {
		return pcsr.findAll();
	}

}
