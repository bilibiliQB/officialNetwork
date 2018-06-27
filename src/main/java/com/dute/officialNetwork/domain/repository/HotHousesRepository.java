package com.dute.officialNetwork.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dute.officialNetwork.domain.entity.HotHouses;

public interface HotHousesRepository extends JpaRepository<HotHouses, Long> {
	Page<HotHouses> findAllByNameLike(String keywords, Pageable pageable);
}
