package com.dute.officialNetwork.api.response.index;

import io.swagger.annotations.ApiModelProperty;

public class ProductCaseTypeResponse1 {

	@ApiModelProperty("返回编号")
	private Integer id;

	@ApiModelProperty("返回简称")
	private String shortName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}
