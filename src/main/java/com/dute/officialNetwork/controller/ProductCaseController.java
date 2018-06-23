package com.dute.officialNetwork.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.api.response.index.ProductCaseResponse0;
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
	public ResultData<List<ProductCaseResponse0>> get6ProductCases() {
		ResultData<List<ProductCaseResponse0>> result = new ResultData<>();
		List<ProductCaseResponse0> lpcr = new ArrayList<>();
		try {
			for (ProductCase pc : pcs.get6ProductCases()) {
				ProductCaseResponse0 pcr = new ProductCaseResponse0();
				BeanUtils.copyProperties(pc, pcr);
				BeanUtils.copyProperties(pc.getProductCaseType(), pcr.getProductCaseTypeResponse());
				BeanUtils.copyProperties(pc.getProductCaseStructure(), pcr.getProductCaseStructureResponse());
				lpcr.add(pcr);
				pcr = null;
			}
			result.setData(lpcr);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
