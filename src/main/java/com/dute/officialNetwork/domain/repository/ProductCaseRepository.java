package com.dute.officialNetwork.domain.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dute.officialNetwork.domain.entity.ProductCase;

public interface ProductCaseRepository extends JpaRepository<ProductCase, Long> {
	List<ProductCase> findTop6ByOrderByCreateTimeDesc();

	List<ProductCase> findByProductCaseStructure_IdAndProductCaseType_IdAndAreaBetween(Integer minArea, Integer maxArea, Pageable pageable);
}
