package com.dute.officialNetwork.api.response.index;

import io.swagger.annotations.ApiModelProperty;

public class ProductCaseResponse0 {

	@ApiModelProperty("返回编号")
	private Long id;

	@ApiModelProperty("返回面积")
	private Integer area;

	@ApiModelProperty("返回简介")
	private String shortIntroduction;

	@ApiModelProperty("返回首页图地址")
	private String firstPicPath;

	private ProductCaseTypeResponse productCaseTypeResponse = new ProductCaseTypeResponse(); // 案例类型

	private ProductCaseStructureResponse productCaseStructureResponse = new ProductCaseStructureResponse(); // 案例结构

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public String getShortIntroduction() {
		return shortIntroduction;
	}

	public void setShortIntroduction(String shortIntroduction) {
		this.shortIntroduction = shortIntroduction;
	}

	public String getFirstPicPath() {
		return firstPicPath;
	}

	public void setFirstPicPath(String firstPicPath) {
		this.firstPicPath = firstPicPath;
	}

	public ProductCaseTypeResponse getProductCaseTypeResponse() {
		return productCaseTypeResponse;
	}

	public void setProductCaseTypeResponse(ProductCaseTypeResponse productCaseTypeResponse) {
		this.productCaseTypeResponse = productCaseTypeResponse;
	}

	public ProductCaseStructureResponse getProductCaseStructureResponse() {
		return productCaseStructureResponse;
	}

	public void setProductCaseStructureResponse(ProductCaseStructureResponse productCaseStructureResponse) {
		this.productCaseStructureResponse = productCaseStructureResponse;
	}

	class ProductCaseTypeResponse {
		@ApiModelProperty("返回简称")
		private String shortName;

		public String getShortName() {
			return shortName;
		}

		public void setShortName(String shortName) {
			this.shortName = shortName;
		}

	}

	class ProductCaseStructureResponse {
		@ApiModelProperty("返回结构名称")
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
