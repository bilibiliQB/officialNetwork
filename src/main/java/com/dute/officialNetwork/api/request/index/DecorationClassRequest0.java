package com.dute.officialNetwork.api.request.index;

import io.swagger.annotations.ApiModelProperty;

public class DecorationClassRequest0 {

	@ApiModelProperty("填写副分类ID")
	private Integer dcsId;

	@ApiModelProperty("填写页数[默认1]")
	private Integer pageNumber = 1;

//	@ApiModelProperty("填写每页显示页数[默认5]")
//	private Integer showCount = 5;

	public Integer getDcsId() {
		return dcsId;
	}

	public void setDcsId(Integer dcsId) {
		this.dcsId = dcsId;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

//	public Integer getShowCount() {
//		return showCount;
//	}
//
//	public void setShowCount(Integer showCount) {
//		this.showCount = showCount;
//	}

}
