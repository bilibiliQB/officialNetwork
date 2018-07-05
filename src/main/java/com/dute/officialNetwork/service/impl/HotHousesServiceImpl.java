package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.HotHouses;
import com.dute.officialNetwork.domain.repository.HotHousesRepository;
import com.dute.officialNetwork.service.interfaces.HotHousesService;

@Service
public class HotHousesServiceImpl implements HotHousesService {

	@Autowired
	private HotHousesRepository hhr;

	@Override
	@Cacheable("ListHotHousesAll#30m")
	public Page<HotHouses> findAll(Pageable pageable) {
		return hhr.findAll(pageable);
	}

	@Override
	@Cacheable("ListHotHousesByNameLike#30m")
	public Page<HotHouses> findAllByNameLike(String keywords, Pageable pageable) {
		StringBuffer str = new StringBuffer();
		str.append("%");
		str.append(keywords);
		str.append("%");
		return hhr.findAllByNameLike(str.toString(), pageable);
	}
}
