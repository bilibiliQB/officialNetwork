package com.dute.officialNetwork.api.request.index;

import io.swagger.annotations.ApiModelProperty;

public class ProductCaseRequest0 {

	@ApiModelProperty("填写结构ID")
	private Integer pcs_id;

	@ApiModelProperty("填写类型ID")
	private Integer pct_id;

	@ApiModelProperty("填写最小面积")
	private Integer minArea;

	@ApiModelProperty("填写最大面积")
	private Integer maxArea;

	@ApiModelProperty("填写页数")
	private Integer pageNumber;

	@ApiModelProperty("填写每页显示页数")
	private Integer showCount;

	public Integer getPcs_id() {
		return pcs_id;
	}

	public void setPcs_id(Integer pcs_id) {
		this.pcs_id = pcs_id;
	}

	public Integer getPct_id() {
		return pct_id;
	}

	public void setPct_id(Integer pct_id) {
		this.pct_id = pct_id;
	}

	public Integer getMinArea() {
		return minArea;
	}

	public void setMinArea(Integer minArea) {
		this.minArea = minArea;
	}

	public Integer getMaxArea() {
		return maxArea;
	}

	public void setMaxArea(Integer maxArea) {
		this.maxArea = maxArea;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		if (pageNumber != null) {
			this.pageNumber = pageNumber - 1;
		}
	}

	public Integer getShowCount() {
		return showCount;
	}

	public void setShowCount(Integer showCount) {
		this.showCount = showCount;
	}

}
