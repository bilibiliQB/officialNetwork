package com.dute.officialNetwork.api.response.index;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.dute.officialNetwork.domain.entity.DecorationClass;

import io.swagger.annotations.ApiModelProperty;

// 装修课堂关键字查询列表详情页格式
public class DecorationClassResponse3 {
	@ApiModelProperty("返回当前页号")
	private Integer currentPageNumber;

	@ApiModelProperty("返回当前总页数")
	private Integer pageCount;

	@ApiModelProperty("返回用户输入的关键字")
	private String keywords;

	private List<DecorationClassResponse> decorationClass = new ArrayList<>(); // 装修课堂列表

	public void copyProperties(DecorationClass dc) {
		DecorationClassResponse dcr = new DecorationClassResponse();
		BeanUtils.copyProperties(dc, dcr);
		decorationClass.add(dcr);
		dcr = null;
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

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public List<DecorationClassResponse> getDecorationClass() {
		return decorationClass;
	}

	public void setDecorationClass(List<DecorationClassResponse> decorationClass) {
		this.decorationClass = decorationClass;
	}

	class DecorationClassResponse {

		@ApiModelProperty("返回主标题")
		private String mainTitle;

		@ApiModelProperty("返回简介")
		private String introduction;

		@ApiModelProperty("返回首页图")
		private String firstPicPath;

		@ApiModelProperty("返回创建时间")
		@JSONField(format = "yyyy/MM/dd HH:mm:ss")
		private Date createTime;

		public String getMainTitle() {
			return mainTitle;
		}

		public void setMainTitle(String mainTitle) {
			this.mainTitle = mainTitle;
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

		public Date getCreateTime() {
			return createTime;
		}

		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}

	}
}
