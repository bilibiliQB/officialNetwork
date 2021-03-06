//package com.dute.officialNetwork.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.dute.officialNetwork.api.po.ProductCasePo;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.dute.officialNetwork.api.request.index.ProductCaseRequest0;
//import com.dute.officialNetwork.api.response.index.ProductCaseResponse0;
//import com.dute.officialNetwork.api.response.index.ProductCaseResponse1;
//import com.dute.officialNetwork.api.response.index.ProductCaseResponse2;
//import com.dute.officialNetwork.domain.entity.ProductCase;
//import com.dute.officialNetwork.service.interfaces.ProductCaseService;
//import com.dute.officialNetwork.util.ResultData;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//
//@Api(description = "处理装修案例")
//@RestController
//@RequestMapping("/productCase")
//public class ProductCaseController {
//
//	@Autowired
//	private ProductCaseService pcs;
//
//	@ApiOperation("获取6个最新装修案例")
//	@PostMapping("/get6ProductCase")
//	public ResultData<List<ProductCasePo>> get6ProductCases() {
//		ResultData<List<ProductCasePo>> result = new ResultData<>();
//		List<ProductCasePo> lpcr = new ArrayList<>();
//		try {
//			lpcr = pcs.get6ProductCases();
//			result.setData(lpcr);
//			result.setStatus(ResultData.CODE_SUCCESS);
//		} catch (Exception e) {
//			result.setStatus(ResultData.CODE_FAIL_BIZ);
//			result.setMessage(e.getMessage());
//		}
//		return result;
//	}
//
//	@ApiOperation("获取装修案例[分页 按条件查询]")
//	@PostMapping("/getProductCase")
//	public ResultData<ProductCaseResponse1> getList(ProductCaseRequest0 pcrq) {
//		ResultData<ProductCaseResponse1> result = new ResultData<>();
//		ProductCaseResponse1 pcrp = new ProductCaseResponse1();
//		try {
//			Page<ProductCase> ppc = pcs.getListByPcs_IdAndPct_IdAndAreaBetween(pcrq.getPcs_id(), pcrq.getPct_id(),
//					pcrq.getMinArea(), pcrq.getMaxArea(),
//					PageRequest.of(pcrq.getPageNumber() - 1, pcrq.getShowCount()));
//			pcrp.setPageCount(ppc.getTotalPages());
//			pcrp.setCurrentPageNumber(pcrq.getPageNumber());
//			for (ProductCase pc : ppc.getContent()) {
//				pcrp.copyProperties(pc);
//			}
//			result.setData(pcrp);
//			result.setStatus(ResultData.CODE_SUCCESS);
//		} catch (Exception e) {
//			result.setStatus(ResultData.CODE_FAIL_BIZ);
//			result.setMessage(e.getMessage());
//		}
//		return result;
//	}
//
//	// 根据ID获取详情
//	@ApiOperation("根据ID获取装修案例详情")
//	@PostMapping("/getOneById/{id}")
//	public ResultData<ProductCaseResponse2> getOne(@PathVariable Long id) {
//		ResultData<ProductCaseResponse2> result = new ResultData<>();
//		ProductCaseResponse2 pcrp = new ProductCaseResponse2();
//		try {
//			ProductCase pc = pcs.getOneById(id);
//			// 更新浏览数
//			if (pc != null) {
//				pc.setViewingCount(pc.getViewingCount() + 1);
//				pcs.updateOne(pc);
//			}
//			BeanUtils.copyProperties(pc, pcrp);
//			result.setData(pcrp);
//			result.setStatus(ResultData.CODE_SUCCESS);
//		} catch (Exception e) {
//			result.setStatus(ResultData.CODE_FAIL_BIZ);
//			result.setMessage(e.getMessage());
//		}
//		return result;
//	}
//}
