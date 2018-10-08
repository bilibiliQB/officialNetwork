package com.dute.officialNetwork.api.po;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ProductCasePo implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty("ID")
	private Long id;// ID

	@ApiModelProperty("简介")
	private String shortIntroduction; // 简介

	@ApiModelProperty("面积")
	private Integer area; // 面积

	@ApiModelProperty("首页图")
	private String firstPicPath; // 首页图

	@ApiModelProperty("案例类型简称")
	private String productCaseTypesName; // 案例风格简称

	@ApiModelProperty("案例结构名称")
	private String productCaseStructuresName; // 案例结构名称

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShortIntroduction() {
		return shortIntroduction;
	}

	public void setShortIntroduction(String shortIntroduction) {
		this.shortIntroduction = shortIntroduction;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public String getFirstPicPath() {
		return firstPicPath;
	}

	public void setFirstPicPath(String firstPicPath) {
		this.firstPicPath = firstPicPath;
	}

	public String getProductCaseTypesName() {
		return productCaseTypesName;
	}

	public void setProductCaseTypesName(String productCaseTypesName) {
		this.productCaseTypesName = productCaseTypesName;
	}

	public String getProductCaseStructuresName() {
		return productCaseStructuresName;
	}

	public void setProductCaseStructuresName(String productCaseStructuresName) {
		this.productCaseStructuresName = productCaseStructuresName;
	}

}
