package com.dute.officialNetwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.api.request.index.HotHousesRequest0;
import com.dute.officialNetwork.api.response.index.HotHousesResponse0;
import com.dute.officialNetwork.domain.entity.HotHouses;
import com.dute.officialNetwork.service.interfaces.HotHousesService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "热装楼盘")
@RestController
@RequestMapping("/hotHouses")
public class HotHousesController {

	@Autowired
	private HotHousesService hhs;

	@ApiOperation("获取所有热装楼盘[或者根据关键字获取][分页]")
	@PostMapping("/getHotHousesList")
	public ResultData<HotHousesResponse0> getAll(HotHousesRequest0 hhr) {
		ResultData<HotHousesResponse0> result = new ResultData<>();
		HotHousesResponse0 hhrp = new HotHousesResponse0();
		try {
			Page<HotHouses> phh = null;
			if (hhr.getKeywords() == null) {
				// 关键字为null调用的方法
				phh = hhs.findAll(PageRequest.of(hhr.getPageNumber() - 1, hhr.getShowCount()));
			} else {
				// 关键字不为null调用的方法
				phh = hhs.findAllByNameLike(hhr.getKeywords(),
						PageRequest.of(hhr.getPageNumber() - 1, hhr.getShowCount()));
			}
			hhrp.setCurrentPageNumber(hhr.getPageNumber());
			hhrp.setPageCount(phh.getTotalPages());
			for (HotHouses hh : phh.getContent()) {
				hhrp.copyProperties(hh);
			}
			result.setData(hhrp);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
