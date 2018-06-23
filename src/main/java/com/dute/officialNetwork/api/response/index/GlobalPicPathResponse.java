package com.dute.officialNetwork.api.response.index;

import io.swagger.annotations.ApiModelProperty;

public class GlobalPicPathResponse {

	@ApiModelProperty("返回图片名称")
	private String picName; // 图片名称
	
	@ApiModelProperty("返回图片地址")
	private String path;

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
