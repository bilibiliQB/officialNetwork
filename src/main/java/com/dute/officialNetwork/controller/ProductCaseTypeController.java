package com.dute.officialNetwork.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.api.response.index.ProductCaseTypeResponse;
import com.dute.officialNetwork.domain.entity.ProductCaseType;
import com.dute.officialNetwork.service.ProductCaseTypeService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "处理案例风格")
@RestController
@RequestMapping("/productCaseType")
public class ProductCaseTypeController {

	@Autowired
	private ProductCaseTypeService pcts;

	@ApiOperation("获取所有案例风格")
	@PostMapping("/getAll")
	public ResultData<List<ProductCaseTypeResponse>> getAll() {
		ResultData<List<ProductCaseTypeResponse>> result = new ResultData<>();
		List<ProductCaseTypeResponse> lpctr = new ArrayList<>();
		try {
			for (ProductCaseType pct : pcts.getAll()) {
				ProductCaseTypeResponse pctr = new ProductCaseTypeResponse();
				BeanUtils.copyProperties(pct, pctr);
				lpctr.add(pctr);
				pctr = null;
			}
			result.setData(lpctr);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
