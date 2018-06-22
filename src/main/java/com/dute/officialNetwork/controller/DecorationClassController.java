package com.dute.officialNetwork.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.api.response.index.DecorationClassResponse0;
import com.dute.officialNetwork.domain.entity.DecorationClass;
import com.dute.officialNetwork.service.DecorationClassService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "处理装修课堂")
@RestController
@RequestMapping("/decorationClass")
public class DecorationClassController {

	@Autowired
	private DecorationClassService dcs;

	@ApiOperation("获取装修课堂7条信息[id 选项][1 准备阶段 2 施工阶段 3 收尾阶段]")
	@PostMapping("/getByMainTypeId/{id}")
	public ResultData<List<DecorationClassResponse0>> getDecorationClass0(@PathVariable Long id) {
		ResultData<List<DecorationClassResponse0>> result = new ResultData<>();
		List<DecorationClassResponse0> dcr = new ArrayList<>();
		try {
			for (DecorationClass dc : dcs.getDecorationClassByMainTypeId(id)) {
				DecorationClassResponse0 dc0 = new DecorationClassResponse0();
				BeanUtils.copyProperties(dc, dc0);
				dcr.add(dc0);
			}
			result.setData(dcr);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
