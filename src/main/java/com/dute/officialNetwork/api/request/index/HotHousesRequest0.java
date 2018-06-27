package com.dute.officialNetwork.api.request.index;

import io.swagger.annotations.ApiModelProperty;

public class HotHousesRequest0 {
	@ApiModelProperty("填写关键字[如果此字段为null就是查询所有]")
	private String keywords;

	@ApiModelProperty("填写页数[默认1]")
	private Integer pageNumber = 1;

	@ApiModelProperty("填写每页显示页数[默认5]")
	private Integer showCount = 5;

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getShowCount() {
		return showCount;
	}

	public void setShowCount(Integer showCount) {
		this.showCount = showCount;
	}

}
