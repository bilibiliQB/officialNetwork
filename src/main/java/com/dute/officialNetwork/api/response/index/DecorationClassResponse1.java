package com.dute.officialNetwork.api.response.index;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import io.swagger.annotations.ApiModelProperty;

import com.alibaba.fastjson.annotation.JSONField;
import com.dute.officialNetwork.domain.entity.DecorationClass;

public class DecorationClassResponse1 {
	@ApiModelProperty("返回当前页号")
	private Integer currentPageNumber;

	@ApiModelProperty("返回当前总页数")
	private Integer pageCount;

	@ApiModelProperty("返回当前副分类ID")
	private Integer dcsId;

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

	public Integer getDcsId() {
		return dcsId;
	}

	public void setDcsId(Integer dcsId) {
		this.dcsId = dcsId;
	}

	public List<DecorationClassResponse> getDecorationClass() {
		return decorationClass;
	}

	public void setDecorationClass(List<DecorationClassResponse> decorationClass) {
		this.decorationClass = decorationClass;
	}

	class DecorationClassResponse {
		@ApiModelProperty("返回ID")
		private Long id;

		@ApiModelProperty("返回主标题")
		private String mainTitle;

		@ApiModelProperty("返回简介")
		private String introduction;

		@ApiModelProperty("返回首页图")
		private String firstPicPath;

		@ApiModelProperty("返回创建时间")
		@JSONField(format = "yyyy/MM/dd HH:mm:ss")
		private Date createTime;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

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
