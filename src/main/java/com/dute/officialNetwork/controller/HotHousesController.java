package com.dute.officialNetwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.api.response.index.HotHousesResponse0;
import com.dute.officialNetwork.domain.entity.HotHouses;
import com.dute.officialNetwork.service.HotHousesService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "热装楼盘")
@RestController
@RequestMapping("/hotHouses")
public class HotHousesController {

	@Autowired
	private HotHousesService hhs;

	@ApiOperation("获取所有热装楼盘[分页]")
	@PostMapping("/getHotHouses/{pageNumber}-{showCount}")
	public ResultData<HotHousesResponse0> getAll(@PathVariable Integer pageNumber, @PathVariable Integer showCount) {
		ResultData<HotHousesResponse0> result = new ResultData<>();
		HotHousesResponse0 hhrp = new HotHousesResponse0();
		try {
			Page<HotHouses> phh = hhs.findAll(PageRequest.of(pageNumber - 1, showCount));
			hhrp.setCurrentPageNumber(pageNumber);
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
