package com.dute.officialNetwork.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.api.response.index.DesignerInformationResponse0;
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

	@ApiOperation("获取5个最新设计师信息")
	@PostMapping("/get3DesignerInformation")
	public ResultData<List<DesignerInformationResponse0>> get5DesignerInformations() {
		ResultData<List<DesignerInformationResponse0>> result = new ResultData<>();
		List<DesignerInformationResponse0> dirs = new ArrayList<>();
		try {
			for (DesignerInformation di : dis.get5DesignerInformations()) {
				DesignerInformationResponse0 dir = new DesignerInformationResponse0();
				BeanUtils.copyProperties(di, dir);
				dirs.add(dir);
				dir = null;
			}
			result.setData(dirs);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
