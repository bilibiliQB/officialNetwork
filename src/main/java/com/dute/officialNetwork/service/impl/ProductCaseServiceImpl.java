package com.dute.officialNetwork.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.ProductCase;
import com.dute.officialNetwork.domain.repository.ProductCaseRepository;
import com.dute.officialNetwork.service.ProductCaseService;

@Service
public class ProductCaseServiceImpl implements ProductCaseService {

	@Autowired
	private ProductCaseRepository pcr;

	@Override
	public List<ProductCase> get6ProductCases() {
		return pcr.findTop6ByOrderByCreateTimeDesc();
	}

	@Override
	public Page<ProductCase> getListByPcs_IdAndPct_IdAndAreaBetween(Integer pcs_id, Integer pct_id, Integer minArea,
			Integer maxArea, Pageable pageable) {
		return pcr.findByProductCaseStructure_IdAndProductCaseType_IdAndAreaBetween(pcs_id, pct_id, minArea, maxArea,
				pageable);
	}
}
