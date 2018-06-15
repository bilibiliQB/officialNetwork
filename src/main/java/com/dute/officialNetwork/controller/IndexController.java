package com.dute.officialNetwork.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.dute.officialNetwork.domain.entity.CustomerInformation;
import com.dute.officialNetwork.service.CustomerInformationService;
import com.dute.officialNetwork.util.IPUtil;

@Controller
// 测试
public class IndexController {

	@Autowired
	private CustomerInformationService cis;

	@RequestMapping("/")
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
}
