package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.ProductCasePicPathsRepository;
import com.dute.officialNetwork.service.ProductCasePicPathsService;

@Service
public class ProductCasePicPathsServiceImpl implements ProductCasePicPathsService {

	@Autowired
	private ProductCasePicPathsRepository pcppr;
}
