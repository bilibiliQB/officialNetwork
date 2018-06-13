package com.dute.officialNetwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//测试
public class IndexController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
