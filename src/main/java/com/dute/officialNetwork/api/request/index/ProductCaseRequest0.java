package com.dute.officialNetwork.api.request.index;

import io.swagger.annotations.ApiModelProperty;

public class ProductCaseRequest0 {

	@ApiModelProperty("填写结构ID")
	private Integer pcs_id;

	@ApiModelProperty("填写类型ID")
	private Integer pct_id;

	@ApiModelProperty("填写最小面积[默认0]")
	private Integer minArea = 0;

	@ApiModelProperty("填写最大面积[默认Integer.MAX_VALUE]")
	private Integer maxArea = Integer.MAX_VALUE;

	@ApiModelProperty("填写页数[默认1]")
	private Integer pageNumber = 1;

	@ApiModelProperty("填写每页显示页数[默认12]")
	private Integer showCount = 12;

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
		this.pageNumber = pageNumber;
	}

	public Integer getShowCount() {
		return showCount;
	}

	public void setShowCount(Integer showCount) {
		this.showCount = showCount;
	}

}
