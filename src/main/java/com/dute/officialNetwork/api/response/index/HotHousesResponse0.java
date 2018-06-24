package com.dute.officialNetwork.api.response.index;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.dute.officialNetwork.domain.entity.HotHouses;

import io.swagger.annotations.ApiModelProperty;

public class HotHousesResponse0 {

	@ApiModelProperty("返回当前页号")
	private Integer currentPageNumber;

	@ApiModelProperty("返回当前总页数")
	private Integer pageCount;

	private List<HotHousesResponse> hotHousesResponse = new ArrayList<>();

	public void copyProperties(HotHouses hh) {
		HotHousesResponse hhr = new HotHousesResponse();
		BeanUtils.copyProperties(hh, hhr);
		hotHousesResponse.add(hhr);
		hhr = null;
	}

	public Integer getCurrentPageNumber() {
		return currentPageNumber;
	}

	public void setCurrentPageNumber(Integer currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public List<HotHousesResponse> getHotHousesResponse() {
		return hotHousesResponse;
	}

	public void setHotHousesResponse(List<HotHousesResponse> hotHousesResponse) {
		this.hotHousesResponse = hotHousesResponse;
	}

	class HotHousesResponse {

		@ApiModelProperty("返回名称")
		private String name;

		@ApiModelProperty("返回简介")
		private String introduction;

		@ApiModelProperty("返回首页图")
		private String firstPicPath;

		@ApiModelProperty("返回房屋均价")
		private Double averagePrice;

		@ApiModelProperty("返回签约户数")
		private Integer contractCount;

		@ApiModelProperty("返回开工户数")
		private Integer startCount;

		@ApiModelProperty("返回竣工户数")
		private Integer endCount;

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

		public String getFirstPicPath() {
			return firstPicPath;
		}

		public void setFirstPicPath(String firstPicPath) {
			this.firstPicPath = firstPicPath;
		}

		public Double getAveragePrice() {
			return averagePrice;
		}

		public void setAveragePrice(Double averagePrice) {
			this.averagePrice = averagePrice;
		}

		public Integer getContractCount() {
			return contractCount;
		}

		public void setContractCount(Integer contractCount) {
			this.contractCount = contractCount;
		}

		public Integer getStartCount() {
			return startCount;
		}

		public void setStartCount(Integer startCount) {
			this.startCount = startCount;
		}

		public Integer getEndCount() {
			return endCount;
		}

		public void setEndCount(Integer endCount) {
			this.endCount = endCount;
		}

	}
}
