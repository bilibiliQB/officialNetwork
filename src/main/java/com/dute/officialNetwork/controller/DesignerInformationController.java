package com.dute.officialNetwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.domain.entity.DesignerInformation;
import com.dute.officialNetwork.service.DesignerInformationService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "处理设计师信息")
@RestController
@RequestMapping("/designerInformation")
public class DesignerInformationController {

	@Autowired
	private DesignerInformationService dis;

	@ApiOperation("获取3个最新设计师信息")
	@PostMapping("/get3")
	public ResultData<List<DesignerInformation>> get3DesignerInformations() {
		ResultData<List<DesignerInformation>> result = new ResultData<>();
		try {
			result.setData(dis.get3DesignerInformations());
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
