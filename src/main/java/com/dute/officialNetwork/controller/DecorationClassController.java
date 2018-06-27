package com.dute.officialNetwork.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.api.request.index.DecorationClassRequest0;
import com.dute.officialNetwork.api.request.index.DecorationClassRequest1;
import com.dute.officialNetwork.api.response.index.DecorationClassResponse0;
import com.dute.officialNetwork.api.response.index.DecorationClassResponse1;
import com.dute.officialNetwork.api.response.index.DecorationClassResponse2;
import com.dute.officialNetwork.api.response.index.DecorationClassResponse3;
import com.dute.officialNetwork.api.response.index.DecorationClassResponse4;
import com.dute.officialNetwork.domain.entity.DecorationClass;
import com.dute.officialNetwork.domain.entity.DecorationClassSubType;
import com.dute.officialNetwork.service.interfaces.DecorationClassService;
import com.dute.officialNetwork.service.interfaces.DecorationClassSubTypeService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "处理装修课堂")
@RestController
@RequestMapping("/decorationClass")
public class DecorationClassController {

	@Autowired
	private DecorationClassService dcs;

	@Autowired
	private DecorationClassSubTypeService dcst;

	@ApiOperation("获取装修课堂7条信息[id 选项][1 准备阶段 2 施工阶段 3 收尾阶段]")
	@PostMapping("/getByMainTypeId0/{id}")
	public ResultData<List<DecorationClassResponse0>> getDecorationClass0(@PathVariable Integer id) {
		ResultData<List<DecorationClassResponse0>> result = new ResultData<>();
		List<DecorationClassResponse0> dcr = new ArrayList<>();
		try {
			for (DecorationClass dc : dcs.getDecorationClassByMainTypeId(id)) {
				DecorationClassResponse0 dc0 = new DecorationClassResponse0();
				BeanUtils.copyProperties(dc, dc0);
				dcr.add(dc0);
				dc0 = null;
			}
			result.setData(dcr);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}

	@ApiOperation("根据副ID获取装修课堂列表[分页 根据浏览数从大到小排序]")
	@PostMapping("/getBySubTypeId")
	public ResultData<DecorationClassResponse1> getDecorationClass1(DecorationClassRequest0 dcrq) {
		ResultData<DecorationClassResponse1> result = new ResultData<>();
		DecorationClassResponse1 dcr = new DecorationClassResponse1();
		try {
			Page<DecorationClass> pdc = dcs.findByDecorationClassSubType_Id(dcrq.getDcsId(),
					PageRequest.of(dcrq.getPageNumber() - 1, dcrq.getShowCount()));
			dcr.setCurrentPageNumber(dcrq.getPageNumber());
			dcr.setPageCount(pdc.getTotalPages());
			dcr.setDcsId(dcrq.getDcsId());
			for (DecorationClass dc : pdc.getContent()) {
				dcr.copyProperties(dc);
			}
			result.setData(dcr);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}

	@ApiOperation("根据主ID获取副ID列表以及装修课堂列表[默认第一页，每页显示5条]")
	@PostMapping("/getByMainTypeId1/{id}")
	public ResultData<DecorationClassResponse2> getDecorationClass2(@PathVariable Integer id) {
		ResultData<DecorationClassResponse2> result = new ResultData<>();
		DecorationClassResponse2 dcr = new DecorationClassResponse2();
		try {
			// 第一个副分类的ID
			Integer first_dcs_id = null;
			// 根据主ID获取副ID列表
			for (DecorationClassSubType dcs : dcst.findByDecorationClassMainType_Id(id)) {
				if (first_dcs_id == null) {
					first_dcs_id = dcs.getId();
				}
				dcr.copyProperties(dcs);
			}
			// 根据副ID获取装修课堂列表[默认第一页，每页显示5条]
			Page<DecorationClass> pdc = dcs.findByDecorationClassSubType_Id(first_dcs_id, PageRequest.of(0, 5));
			dcr.setCurrentPageNumber(1);
			dcr.setPageCount(pdc.getTotalPages());
			dcr.setDcsId(first_dcs_id);
			for (DecorationClass dc : pdc.getContent()) {
				dcr.copyProperties(dc);
			}
			result.setData(dcr);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Throwable e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}

	@ApiOperation("关键字查询装修课堂列表[分页]")
	@PostMapping("/getByKeywordsLike")
	public ResultData<DecorationClassResponse3> getDecorationClass3(DecorationClassRequest1 dcrq) {
		ResultData<DecorationClassResponse3> result = new ResultData<>();
		DecorationClassResponse3 dcr = new DecorationClassResponse3();
		try {
			for (DecorationClass dc : dcs.findByKeywordsLike(dcrq.getKeywords(),
					PageRequest.of(dcrq.getPageNumber() - 1, dcrq.getShowCount()))) {
				dcr.copyProperties(dc);
			}
			dcr.setKeywords(dcrq.getKeywords());
			result.setData(dcr);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}

	@ApiOperation("根据ID获取装修课堂文章详情页")
	@PostMapping("/getOneById/{id}")
	public ResultData<DecorationClassResponse4> getDecorationClass4(@PathVariable Long id) {
		ResultData<DecorationClassResponse4> result = new ResultData<>();
		DecorationClassResponse4 dcr = new DecorationClassResponse4();
		try {
			DecorationClass dc = dcs.getOneById(id);
			BeanUtils.copyProperties(dc, dcr);
			result.setData(dcr);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
