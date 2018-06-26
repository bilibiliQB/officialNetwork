package com.dute.officialNetwork.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dute.officialNetwork.domain.entity.HotHouses;

public interface HotHousesService {
	Page<HotHouses> findAll(Pageable pageable);
}
