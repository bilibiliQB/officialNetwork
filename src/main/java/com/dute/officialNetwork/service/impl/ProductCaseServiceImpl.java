package com.dute.officialNetwork.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.ProductCase;
import com.dute.officialNetwork.domain.repository.ProductCaseRepository;
import com.dute.officialNetwork.service.interfaces.ProductCaseService;

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
		if (pcs_id == null) {
			if (pct_id == null) {
				// 结构ID[无] 类型ID[无]
				return pcr.findByProductCaseStructure_IdBetweenAndProductCaseType_IdBetweenAndAreaBetween(0,
						Integer.MAX_VALUE, 0, Integer.MAX_VALUE, minArea, maxArea, pageable);
			} else {
				// 结构ID[无] 类型ID[有]
				return pcr.findByProductCaseStructure_IdBetweenAndProductCaseType_IdBetweenAndAreaBetween(0,
						Integer.MAX_VALUE, pct_id, pct_id, minArea, maxArea, pageable);
			}
		} else {
			if (pct_id == null) {
				// 结构ID[有] 类型ID[无]
				return pcr.findByProductCaseStructure_IdBetweenAndProductCaseType_IdBetweenAndAreaBetween(pcs_id,
						pcs_id, 0, Integer.MAX_VALUE, minArea, maxArea, pageable);
			} else {
				// 结构ID[有] 类型ID[有]
				return pcr.findByProductCaseStructure_IdBetweenAndProductCaseType_IdBetweenAndAreaBetween(pcs_id,
						pcs_id, pct_id, pct_id, minArea, maxArea, pageable);
			}
		}
	}

	@Override
	public List<ProductCase> get4ProductCasesByPct_Id(Integer pct_id) {
		return pcr.findTop4ByProductCaseType_Id(pct_id);
	}

}
