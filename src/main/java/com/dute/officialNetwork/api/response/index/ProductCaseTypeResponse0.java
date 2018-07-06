package com.dute.officialNetwork.api.response.index;

import io.swagger.annotations.ApiModelProperty;

public class ProductCaseTypeResponse0 {
	@ApiModelProperty("返回首页图")
	private String firstPicPath;
	
	@ApiModelProperty("编号")
	private Integer id;

	public String getFirstPicPath() {
		return firstPicPath;
	}

	public void setFirstPicPath(String firstPicPath) {
		this.firstPicPath = firstPicPath;
	}

}
