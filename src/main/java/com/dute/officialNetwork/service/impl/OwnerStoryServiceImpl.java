package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.OwnerStoryRepository;
import com.dute.officialNetwork.service.OwnerStoryService;

@Service
public class OwnerStoryServiceImpl implements OwnerStoryService {

	@Autowired
	private OwnerStoryRepository osr;
}
