package com.dute.officialNetwork.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dute.officialNetwork.domain.entity.CorporateNews;

public interface CorporateNewsRepository extends JpaRepository<CorporateNews, Integer> {
	Page<CorporateNews> findAllByOrderByCreateTimeDesc(Pageable pageable);
}
