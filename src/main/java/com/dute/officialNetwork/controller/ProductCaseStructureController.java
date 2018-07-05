package com.dute.officialNetwork.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.api.response.index.ProductCaseStructureResponse0;
import com.dute.officialNetwork.domain.entity.ProductCaseStructure;
import com.dute.officialNetwork.service.interfaces.ProductCaseStructureService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "处理案例结构")
@RestController
@RequestMapping("/decorationClassStructure")
public class ProductCaseStructureController {

	@Autowired
	private ProductCaseStructureService pcss;

	@ApiOperation("获取所有案例结构[条件查询中的选项]")
	@PostMapping("/getAll")
	public ResultData<List<ProductCaseStructureResponse0>> getAll() {
		ResultData<List<ProductCaseStructureResponse0>> result = new ResultData<>();
		List<ProductCaseStructureResponse0> lpcsr = new ArrayList<>();
		try {
			for (ProductCaseStructure pcs : pcss.getAll()) {
				ProductCaseStructureResponse0 pcsr = new ProductCaseStructureResponse0();
				BeanUtils.copyProperties(pcs, pcsr);
				lpcsr.add(pcsr);
				pcsr = null;
			}
			result.setData(lpcsr);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
