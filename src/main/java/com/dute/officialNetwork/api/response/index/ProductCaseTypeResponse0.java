package com.dute.officialNetwork.api.response.index;

import io.swagger.annotations.ApiModelProperty;

public class ProductCaseTypeResponse0 {

	@ApiModelProperty("全称")
	private String fullName;
	
	@ApiModelProperty("首页图")
	private String firstPicPath;
	
	@ApiModelProperty("每平价格")
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
