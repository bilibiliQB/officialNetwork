package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.HotHouses;
import com.dute.officialNetwork.domain.repository.HotHousesRepository;
import com.dute.officialNetwork.service.HotHousesService;

@Service
public class HotHousesServiceImpl implements HotHousesService {

	@Autowired
	private HotHousesRepository hhr;

	@Override
	public Page<HotHouses> findAll(Pageable pageable) {
		return hhr.findAll(pageable);
	}
}
