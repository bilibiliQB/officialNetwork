package com.dute.officialNetwork.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.dute.officialNetwork.api.po.DrawLotteryRafflePo;
import com.dute.officialNetwork.api.po.ProductCaseTypePo;
import com.dute.officialNetwork.domain.entity.DrawLotteryRaffle;
import com.dute.officialNetwork.domain.entity.ProductCaseType;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.ProductCaseTypeRepository;
import com.dute.officialNetwork.service.interfaces.ProductCaseTypeService;

@Service
public class ProductCaseTypeServiceImpl implements ProductCaseTypeService {

	@Autowired
	private ProductCaseTypeRepository pctr;

	@Override
	@Cacheable("ListProductCaseTypeAll#1d")
	public List<ProductCaseTypePo> getAll() {
		List<ProductCaseTypePo> list = new ArrayList<>();
		for(ProductCaseType productCaseType : pctr.findAll()){
			ProductCaseTypePo productCaseTypePo = new ProductCaseTypePo();
			BeanUtils.copyProperties(productCaseType,productCaseTypePo);
			list.add(productCaseTypePo);
		}
		return list;
	}

}
