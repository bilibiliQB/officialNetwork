package com.dute.officialNetwork.domain.repository.hdcases;

import com.dute.officialNetwork.domain.entity.HdCases;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HdCasesRepository extends JpaRepository<HdCases,Integer>,JpaSpecificationExecutor<HdCases> {
    HdCases findByHdCasesOrder(int i);

    Page<HdCases> findByHdCasesStyle(Pageable pageRequest, String integralDecorationName);
    
    @Query(value = "SELECT * FROM `hd_cases` WHERE hd_cases_id < :hd_cases_id ORDER BY hd_cases_id DESC LIMIT 0,1;", nativeQuery = true)
    HdCases prvieHdCases(@Param("hd_cases_id") Integer id);
	
	@Query(value = "SELECT * FROM `hd_cases` WHERE hd_cases_id > :hd_cases_id ORDER BY hd_cases_id ASC LIMIT 0,1;", nativeQuery = true)
	HdCases nextHdCases(@Param("hd_cases_id") Integer id);
	
	@Query(value = "SELECT * FROM `hd_cases` ORDER BY hd_cases_id ASC LIMIT 0,1;", nativeQuery = true)
	HdCases firstHdCases();
	
	@Query(value = "SELECT * FROM `hd_cases` ORDER BY hd_cases_id DESC LIMIT 0,1;", nativeQuery = true)
	HdCases lastHdCases();
}
