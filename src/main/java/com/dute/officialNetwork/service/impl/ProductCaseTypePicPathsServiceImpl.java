package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.ProductCaseTypePicPathsRepository;
import com.dute.officialNetwork.service.ProductCaseTypePicPathsService;

@Service
public class ProductCaseTypePicPathsServiceImpl implements ProductCaseTypePicPathsService {

	@Autowired
	private ProductCaseTypePicPathsRepository pcsppr;
}