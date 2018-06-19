package com.dute.officialNetwork.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.domain.entity.CustomerInformation;
import com.dute.officialNetwork.service.CustomerInformationService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "客户的请求控制器")
@RestController
public class RequestController {

	@Autowired
	private CustomerInformationService cis;

	@ApiOperation("存储用户信息")
	@PostMapping("/save")
	public ResultData<Void> commitInfo(CustomerInformation ci, HttpServletRequest request) {
		ResultData<Void> result = new ResultData<>();
		try {
			cis.save(ci, request);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
