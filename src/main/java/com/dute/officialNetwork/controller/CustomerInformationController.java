package com.dute.officialNetwork.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.api.request.index.CustomerInformationRequest0;
import com.dute.officialNetwork.domain.entity.CustomerInformation;
import com.dute.officialNetwork.service.CustomerInformationService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "处理客户信息")
@RestController
@RequestMapping("/customerInformation")
public class CustomerInformationController {

	@Autowired
	private CustomerInformationService cis;

	@ApiOperation("存储客户信息")
	@PostMapping("/save")
	public ResultData<Void> commitInfo(CustomerInformationRequest0 cir, HttpServletRequest request) {
		ResultData<Void> result = new ResultData<>();
		CustomerInformation ci = new CustomerInformation();
		try {
			BeanUtils.copyProperties(cir, ci);
			cis.save(ci, request);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
