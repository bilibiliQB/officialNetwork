package com.dute.officialNetwork.api.response.index;

import io.swagger.annotations.ApiModelProperty;

public class ProductCaseTypeResponse0 {

	@ApiModelProperty("返回全称")
	private String fullName;
	
	@ApiModelProperty("返回首页图")
	private String firstPicPath;
	
	@ApiModelProperty("返回每平价格")
	private Integer price;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFirstPicPath() {
		return firstPicPath;
	}

	public void setFirstPicPath(String firstPicPath) {
		this.firstPicPath = firstPicPath;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
