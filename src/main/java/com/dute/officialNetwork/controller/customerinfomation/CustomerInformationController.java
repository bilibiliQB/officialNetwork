package com.dute.officialNetwork.controller.customerinfomation;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.api.request.index.CustomerInformationRequest0;
import com.dute.officialNetwork.domain.entity.CustomerInformation;
import com.dute.officialNetwork.service.interfaces.CustomerInformationService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "处理客户信息")
@RestController
@RequestMapping("/customerInformation")
public class CustomerInformationController {

	@Autowired
	private CustomerInformationService cis;

	@ApiOperation("存储客户信息-1")
	@PostMapping("/save")
	public ResultData<Boolean> commitInfo(String name,String data, HttpServletRequest request) {
        CustomerInformationRequest0 cir = JSONObject.parseObject(data, CustomerInformationRequest0.class);
        ResultData<Boolean> result = new ResultData<>();
		CustomerInformation ci = new CustomerInformation();
		try {
			BeanUtils.copyProperties(cir, ci);
			long flag = cis.save(ci, request);
			if(flag != 0){
				result.setData(true);
			}else{
				result.setStatus(ResultData.CODE_FAIL_BIZ);
				result.setMessage("申请失败");
				result.setData(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
			result.setData(false);
		}
		return result;
	}
	
	@ApiOperation("存储客户信息-2")
	@PostMapping("/save_ob")
	public ResultData<Boolean> commitInfo(CustomerInformationRequest0 cir, HttpServletRequest request) {
        ResultData<Boolean> result = new ResultData<>();
		CustomerInformation ci = new CustomerInformation();
		try {
			BeanUtils.copyProperties(cir, ci);
			long flag = cis.save(ci, request);
			if(flag != 0){
				result.setData(true);
			}else{
				result.setStatus(ResultData.CODE_FAIL_BIZ);
				result.setMessage("申请失败");
				result.setData(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
			result.setData(false);
		}
		return result;
	}
	
}
