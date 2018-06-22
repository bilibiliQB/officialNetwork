package com.dute.officialNetwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.domain.entity.ProductCase;
import com.dute.officialNetwork.service.ProductCaseService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "处理装修案例")
@RestController
@RequestMapping("/productCase")
public class ProductCaseController {

	@Autowired
	private ProductCaseService pcs;

	@ApiOperation("获取6个最新装修案例")
	@PostMapping("/get6")
	public ResultData<List<ProductCase>> get6ProductCases() {
		ResultData<List<ProductCase>> result = new ResultData<>();
		try {
			result.setData(pcs.get6ProductCases());
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
