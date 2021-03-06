package com.dute.officialNetwork.api.request.index;

import io.swagger.annotations.ApiModelProperty;

public class CustomerInformationRequest0 {

	@ApiModelProperty("填写客户姓名")
	private String name;// 客户姓名

	@ApiModelProperty("填写客户手机号")
	private String phoneNumber;// 客户手机号

	@ApiModelProperty("描述")
	private String problemDescription;// 问题描述

	@ApiModelProperty("填写房屋面积")
	private String houseArea;// 房屋面积

	@ApiModelProperty("填写楼盘名称")
	private String housesName;// 楼盘名称

	@ApiModelProperty("数据来源")
	private String from;// 数据来源

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProblemDescription() {
		return problemDescription;
	}

	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	public String getHouseArea() {
		return houseArea;
	}

	public void setHouseArea(String houseArea) {
		this.houseArea = houseArea;
	}

	public String getHousesName() {
		return housesName;
	}

	public void setHousesName(String housesName) {
		this.housesName = housesName;
	}
	
}
