package com.dute.officialNetwork.api.response.index;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.dute.officialNetwork.domain.entity.OwnerStory;

import io.swagger.annotations.ApiModelProperty;

public class OwnerStoryResponse0 {

//	@ApiModelProperty("返回用户输入的关键字")
//	private String keywords;

	@ApiModelProperty("返回当前页号")
	private Integer currentPageNumber;

	@ApiModelProperty("返回当前总页数")
	private Integer pageCount;

	List<OwnerStoryResponse> ownerStory = new ArrayList<>(); // 业主故事列表

	public void copyProperties(OwnerStory os) {
		OwnerStoryResponse osr = new OwnerStoryResponse();
		BeanUtils.copyProperties(os, osr);
		ownerStory.add(osr);
		osr = null;
	}

//	public String getKeywords() {
//		return keywords;
//	}
//
//	public void setKeywords(String keywords) {
//		this.keywords = keywords;
//	}

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

	public List<OwnerStoryResponse> getOwnerStory() {
		return ownerStory;
	}

	public void setOwnerStory(List<OwnerStoryResponse> ownerStory) {
		this.ownerStory = ownerStory;
	}

	class OwnerStoryResponse {

		@ApiModelProperty("返回ID")
		private Long id;

		@ApiModelProperty("返回首页图")
		private String firstPicPath;

		@ApiModelProperty("返回主标题")
		private String mainTitle;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstPicPath() {
			return firstPicPath;
		}

		public void setFirstPicPath(String firstPicPath) {
			this.firstPicPath = firstPicPath;
		}

		public String getMainTitle() {
			return mainTitle;
		}

		public void setMainTitle(String mainTitle) {
			this.mainTitle = mainTitle;
		}

	}
}
