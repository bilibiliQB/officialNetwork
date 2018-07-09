package com.dute.officialNetwork.api.response.index;

import io.swagger.annotations.ApiModelProperty;

public class DesignerInformationResponse0 {

	@ApiModelProperty("返回设计师编号")
	private Integer id;

	@ApiModelProperty("返回设计师姓名")
	private String name;

	@ApiModelProperty("返回设计师简介")
	private String introduction;
	
	@ApiModelProperty("返回设计师头像图片")
	private String picPath;

	@ApiModelProperty("设计师工作年限")
	private  String workYear; //设计师工作年限

	@ApiModelProperty("设计师擅长风格")
	private String adeptStyle; //设计师擅长风格

	@ApiModelProperty("设计师水平")
	private String level; //设计师水平

	public String getWorkYear() {
		return workYear;
	}

	public void setWorkYear(String workYear) {
		this.workYear = workYear;
	}

	public String getAdeptStyle() {
		return adeptStyle;
	}

	public void setAdeptStyle(String adeptStyle) {
		this.adeptStyle = adeptStyle;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	
}
