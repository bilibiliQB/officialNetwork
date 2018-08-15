package com.dute.officialNetwork.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dute.officialNetwork.domain.entity.CorporateNews;

public interface CorporateNewsRepository extends JpaRepository<CorporateNews, Integer> {
	Page<CorporateNews> findAllByOrderByCreateTimeDesc(Pageable pageable);

	@Query(value = "SELECT * FROM `corporate_news` WHERE cn_id < :cn_id ORDER BY cn_id DESC LIMIT 0,1;", nativeQuery = true)
	CorporateNews prvieCorporateNews(@Param("cn_id") Integer id);
	
	@Query(value = "SELECT * FROM `corporate_news` WHERE cn_id > :cn_id ORDER BY cn_id ASC LIMIT 0,1;", nativeQuery = true)
	CorporateNews nextCorporateNews(@Param("cn_id") Integer id);
	
	@Query(value = "SELECT * FROM `corporate_news` ORDER BY cn_id ASC LIMIT 0,1;", nativeQuery = true)
	CorporateNews firstCorporateNews();
	
	@Query(value = "SELECT * FROM `corporate_news` ORDER BY cn_id DESC LIMIT 0,1;", nativeQuery = true)
	CorporateNews lastCorporateNews();
}
