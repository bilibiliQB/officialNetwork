//package com.dute.officialNetwork.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.dute.officialNetwork.api.response.index.DecorationClassResponse0;
//import com.dute.officialNetwork.api.response.index.ProductCaseResponse0;
//import com.dute.officialNetwork.api.response.index.ProductCaseTypeResponse0;
//import com.dute.officialNetwork.domain.entity.DecorationClass;
//import com.dute.officialNetwork.domain.entity.ProductCase;
//import com.dute.officialNetwork.domain.entity.ProductCaseType;
//import com.dute.officialNetwork.service.interfaces.DecorationClassService;
//import com.dute.officialNetwork.service.interfaces.ProductCaseService;
//import com.dute.officialNetwork.service.interfaces.ProductCaseTypeService;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.dute.officialNetwork.api.response.index.DesignerInformationResponse0;
//import com.dute.officialNetwork.domain.entity.DesignerInformation;
//import com.dute.officialNetwork.service.interfaces.DesignerInformationService;
//import com.dute.officialNetwork.util.ResultData;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//
//@Api(description = "首页相关控制器")
//@RestController
//@RequestMapping("/designerInformation")
//public class DesignerInformationController {
//
//	@Autowired
//	private DesignerInformationService dis;
//
////	@Autowired
////	private DecorationClassService dcs;
////
////	@Autowired
////	private ProductCaseService pcs;
////
////	@Autowired
////	private ProductCaseTypeService pcts;
////
////	@ApiOperation("首页设计师列表+业主案例+VR体验+走进独特+装修课堂列表五合一")
////	@PostMapping("/getMainData")
////	public ResultData<> get5DesignerInformations() {
////		ResultData<> result = new ResultData<>();
////		//定义相关数据集
////		List<DesignerInformationResponse0> dirs = new ArrayList<>(); //设计师 5 名
////		List<DecorationClassResponse0> dcr_1 = new ArrayList<>(); //装修课堂 1 准备阶段  6 条
////		List<DecorationClassResponse0> dcr_2 = new ArrayList<>(); //装修课堂 2 施工阶段  6 条
////		List<DecorationClassResponse0> dcr_3 = new ArrayList<>(); //装修课堂 3 收尾阶段  6 条
////		List<ProductCaseResponse0> lpcr = new ArrayList<>(); //装修案例 6 条
////		List<ProductCaseTypeResponse0> lpctr = new ArrayList<>(); //装修风格
////
////		try {
////			for (DesignerInformation di : dis.get5DesignerInformations()) {
////				DesignerInformationResponse0 dir = new DesignerInformationResponse0();
////				BeanUtils.copyProperties(di, dir);
////				dirs.add(dir);
////				dir = null;
////			}
////			for (DecorationClass dc : dcs.getDecorationClassByMainTypeId(1)) {
////				DecorationClassResponse0 dc0 = new DecorationClassResponse0();
////				BeanUtils.copyProperties(dc, dc0);
////				dcr_1.add(dc0);
////				dc0 = null;
////			}
////			for (DecorationClass dc : dcs.getDecorationClassByMainTypeId(2)) {
////				DecorationClassResponse0 dc0 = new DecorationClassResponse0();
////				BeanUtils.copyProperties(dc, dc0);
////				dcr_2.add(dc0);
////				dc0 = null;
////			}
////			for (DecorationClass dc : dcs.getDecorationClassByMainTypeId(3)) {
////				DecorationClassResponse0 dc0 = new DecorationClassResponse0();
////				BeanUtils.copyProperties(dc, dc0);
////				dcr_3.add(dc0);
////				dc0 = null;
////			}
////			for (ProductCase pc : pcs.get6ProductCases()) {
////				ProductCaseResponse0 pcr = new ProductCaseResponse0();
////				BeanUtils.copyProperties(pc, pcr);
////				BeanUtils.copyProperties(pc.getProductCaseType(), pcr.getProductCaseTypeResponse());
////				BeanUtils.copyProperties(pc.getProductCaseStructure(), pcr.getProductCaseStructureResponse());
////				lpcr.add(pcr);
////				pcr = null;
////			}
////			for (ProductCaseType pct : pcts.getAll()) {
////				ProductCaseTypeResponse0 pctr = new ProductCaseTypeResponse0();
////				BeanUtils.copyProperties(pct, pctr);
////				lpctr.add(pctr);
////				pctr = null;
////			}
////			result.setData(dirs);
////			result.setStatus(ResultData.CODE_SUCCESS);
////		} catch (Exception e) {
////			result.setStatus(ResultData.CODE_FAIL_BIZ);
////			result.setMessage(e.getMessage());
////		}
////		return result;
////	}
//
//
//
//
////	@ApiOperation("获取5个最新设计师信息")
////	@PostMapping("/get5DesignerInformation")
////	public ResultData<List<DesignerInformationResponse0>> get5DesignerInformations() {
////		ResultData<List<DesignerInformationResponse0>> result = new ResultData<>();
////		List<DesignerInformationResponse0> dirs = new ArrayList<>();
////		try {
////			for (DesignerInformation di : dis.get5DesignerInformations()) {
////				DesignerInformationResponse0 dir = new DesignerInformationResponse0();
////				BeanUtils.copyProperties(di, dir);
////				dirs.add(dir);
////				dir = null;
////			}
////			result.setData(dirs);
////			result.setStatus(ResultData.CODE_SUCCESS);
////		} catch (Exception e) {
////			result.setStatus(ResultData.CODE_FAIL_BIZ);
////			result.setMessage(e.getMessage());
////		}
////		return result;
////	}
//}
