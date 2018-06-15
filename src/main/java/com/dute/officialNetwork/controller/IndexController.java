package com.dute.officialNetwork.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.dute.officialNetwork.api.request.index.TestRequest;
import com.dute.officialNetwork.api.response.index.TestResponse;
import com.dute.officialNetwork.util.ResultData;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.dute.officialNetwork.domain.entity.CustomerInformation;
import com.dute.officialNetwork.service.CustomerInformationService;
import com.dute.officialNetwork.util.IPUtil;

import java.util.ArrayList;
import java.util.List;

@Api(description = "测试用例")
@Controller
@RequestMapping("web/index")
// 测试
public class IndexController {

	@Autowired
	private CustomerInformationService cis;

	@ApiOperation("首页测试")
	@PostMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/save")
	@ResponseBody
	public Object save(HttpServletRequest request, @Valid CustomerInformation ci, BindingResult result) {
		JSONObject json = new JSONObject();
		// hibernate Validator为快速失败返回模式,返回有且只有一条错误信息
		if (result.hasErrors()) {
			json.put("error", result.getAllErrors().get(0).getDefaultMessage());
		} else {
			ci.setIP(IPUtil.getIpAddr(request));
			if (cis.save(ci) != null) {
				json.put("success", "提交成功");
			} else {
				json.put("fail", "提交失败");
			}
		}
		return json;
	}

	/**
	 * 所有的controller的方法，有返回数据的，都把返回值设置成工具包中过得 ResultData<T> 类型，
	 * 接口访问成功，resultData.setStatus(true);返回数据全部创建 response 对象，并给response对象属性添加注释，
	 * 接口访问失败或者中途出现异常，resultData.setStatus(false);将发生错误的信息设置在 message 中
	 */
	@PostMapping("test")
	@ResponseBody
	public ResultData<List<TestResponse>> testInter(TestRequest request){
		ResultData<List<TestResponse>> resultData = new ResultData<>();
		try {
			List<TestResponse> list = new ArrayList<>();
			TestResponse testResponse = new TestResponse();
			testResponse.setId(request.getId());
			testResponse.setName(request.getName());
			list.add(testResponse);
			resultData.setData(list);
			return resultData;
		}catch (Exception e){
			resultData.setStatus(ResultData.CODE_FAIL_BIZ);
			resultData.setMessage(e.getMessage());
			return resultData;
		}
	}
}
