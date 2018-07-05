package com.dute.officialNetwork.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.ProductCaseType;
import com.dute.officialNetwork.domain.repository.ProductCaseTypeRepository;
import com.dute.officialNetwork.service.interfaces.ProductCaseTypeService;

@Service
public class ProductCaseTypeServiceImpl implements ProductCaseTypeService {

	@Autowired
	private ProductCaseTypeRepository pctr;

	@Override
	@Cacheable("ListProductCaseTypeAll#1d")
	public List<ProductCaseType> getAll() {
		return pctr.findAll();
	}

}
