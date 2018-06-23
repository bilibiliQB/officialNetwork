package com.dute.officialNetwork.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.api.response.index.GlobalPicPathResponse;
import com.dute.officialNetwork.domain.entity.GlobalPicPath;
import com.dute.officialNetwork.service.GlobalPicPathService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "全局")
@RestController
@RequestMapping("/global")
public class GlobalPicPathController {

	@Autowired
	private GlobalPicPathService gpps;

	@ApiOperation("通过名称获取图片组")
	@PostMapping("/getPicPathByGroupName/{groupName}")
	public ResultData<List<GlobalPicPathResponse>> getPicPathList(@PathVariable String groupName) {
		ResultData<List<GlobalPicPathResponse>> result = new ResultData<>();
		List<GlobalPicPathResponse> lgppr = new ArrayList<>();
		try {
			for (GlobalPicPath gpp : gpps.getAllByGroupName(groupName)) {
				GlobalPicPathResponse gppr = new GlobalPicPathResponse();
				BeanUtils.copyProperties(gpp, gppr);
				lgppr.add(gppr);
				gppr = null;
			}
			result.setData(lgppr);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
