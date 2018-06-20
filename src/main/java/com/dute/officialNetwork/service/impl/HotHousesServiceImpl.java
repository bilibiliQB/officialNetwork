package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.HotHousesRepository;
import com.dute.officialNetwork.service.HotHousesService;

@Service
public class HotHousesServiceImpl implements HotHousesService {

	@Autowired
	private HotHousesRepository hhr;
}
