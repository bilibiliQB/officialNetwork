package com.dute.officialNetwork.service.interfaces;

import java.util.List;

import com.dute.officialNetwork.api.po.ProductCasePo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dute.officialNetwork.domain.entity.ProductCase;

public interface ProductCaseService {
	List<ProductCasePo> get6ProductCases();

	Page<ProductCase> getListByPcs_IdAndPct_IdAndAreaBetween(Integer pcs_id, Integer pct_id, Integer minArea,
			Integer maxArea, Pageable pageable);

	List<ProductCase> get4ProductCasesByPct_Id(Integer pct_id);
	
	ProductCase getOneById(Long id);
	
	ProductCase updateOne(ProductCase productCase);
}
