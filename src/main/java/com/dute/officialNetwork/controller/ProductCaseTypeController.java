//package com.dute.officialNetwork.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.dute.officialNetwork.api.po.ProductCaseTypePo;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.dute.officialNetwork.api.response.index.ProductCaseTypeResponse0;
//import com.dute.officialNetwork.api.response.index.ProductCaseTypeResponse1;
//import com.dute.officialNetwork.api.response.index.ProductCaseTypeResponse2;
//import com.dute.officialNetwork.domain.entity.ProductCase;
//import com.dute.officialNetwork.domain.entity.ProductCaseType;
//import com.dute.officialNetwork.service.interfaces.ProductCaseService;
//import com.dute.officialNetwork.service.interfaces.ProductCaseTypeService;
//import com.dute.officialNetwork.util.ResultData;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//
//@Api(description = "处理案例风格")
//@RestController
//@RequestMapping("/productCaseType")
//public class ProductCaseTypeController {
//
//	@Autowired
//	private ProductCaseTypeService pcts;
//
//	@Autowired
//	private ProductCaseService pcs;
//
//	@ApiOperation("获取所有案例风格[格式0][首页轮播图]")
//	@PostMapping("/getAllStyle_0")
//	public ResultData<List<ProductCaseTypePo>> getAll_0() {
//		ResultData<List<ProductCaseTypePo>> result = new ResultData<>();
//		List<ProductCaseTypePo> lpctr = new ArrayList<>();
//		try {
//			lpctr = pcts.getAll();
//			result.setData(lpctr);
//			result.setStatus(ResultData.CODE_SUCCESS);
//		} catch (Exception e) {
//			result.setStatus(ResultData.CODE_FAIL_BIZ);
//			result.setMessage(e.getMessage());
//		}
//		return result;
//	}
//
//	@ApiOperation("获取所有案例风格[格式1][条件查询中的选项]")
//	@PostMapping("/getAllStyle_1")
//	public ResultData<List<ProductCaseTypePo>> getAll_1() {
//		ResultData<List<ProductCaseTypePo>> result = new ResultData<>();
//		List<ProductCaseTypePo> lpctr = new ArrayList<>();
//		try {
//			lpctr = pcts.getAll();
//			result.setData(lpctr);
//			result.setStatus(ResultData.CODE_SUCCESS);
//		} catch (Exception e) {
//			result.setStatus(ResultData.CODE_FAIL_BIZ);
//			result.setMessage(e.getMessage());
//		}
//		return result;
//	}
//
//	@ApiOperation("获取所有案例风格[格式2][每个案例风格下有4个案例]")
//	@PostMapping("/getAllStyle_2")
//	public ResultData<List<ProductCaseTypePo>> getAll_2() {
//		ResultData<List<ProductCaseTypePo>> result = new ResultData<>();
//		List<ProductCaseTypePo> lpctr = new ArrayList<>();
//		try {
//			lpctr = pcts.getAll();
//			result.setData(lpctr);
//			result.setStatus(ResultData.CODE_SUCCESS);
//		} catch (Exception e) {
//			result.setStatus(ResultData.CODE_FAIL_BIZ);
//			result.setMessage(e.getMessage());
//		}
//		return result;
//	}
//}
