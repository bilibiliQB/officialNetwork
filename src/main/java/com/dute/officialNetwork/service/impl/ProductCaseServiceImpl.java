package com.dute.officialNetwork.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.dute.officialNetwork.api.po.DrawLotteryRafflePo;
import com.dute.officialNetwork.api.po.ProductCasePo;
import com.dute.officialNetwork.domain.entity.DrawLotteryRaffle;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
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
	public List<ProductCasePo> get6ProductCases() {
		List<ProductCasePo> list = new ArrayList<>();
		for(ProductCase productCase : pcr.findTop6ByOrderByCreateTimeDesc()){
			ProductCasePo productCasePo = new ProductCasePo();
			BeanUtils.copyProperties(productCase,productCasePo);
			productCasePo.setProductCaseTypes(productCase.getProductCaseType().getFullName());
			productCasePo.setProductCaseStructures(productCase.getProductCaseStructure().getName());
			list.add(productCasePo);
		}
		return list;
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
	@Cacheable("get4ProductCasesByPct_Id#12h")
	public List<ProductCase> get4ProductCasesByPct_Id(Integer pct_id) {
		return pcr.findTop4ByProductCaseType_Id(pct_id);
	}

	@Override
	public ProductCase getOneById(Long id) {
		ProductCase pc = pcr.getOne(id);
		pc.getViewingCount();
		return pc;
	}

	@Override
	public ProductCase updateOne(ProductCase productCase) {
		return pcr.save(productCase);
	}

}
