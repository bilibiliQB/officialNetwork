package com.dute.officialNetwork.api.response.index;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModelProperty;

public abstract class BasisArticleDetails {
	@ApiModelProperty("返回主标题")
	private String mainTitle;

	@ApiModelProperty("返回副标题")
	private String subTitle;

	@ApiModelProperty("返回作者名称")
	private String authorName;

	@ApiModelProperty("返回浏览数")
	private Integer viewingCount;

	@ApiModelProperty("返回内容")
	private String content;

	@ApiModelProperty("返回创建时间")
	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	private Date createTime;

	public String getMainTitle() {
		return mainTitle;
	}

	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getViewingCount() {
		return viewingCount;
	}

	public void setViewingCount(Integer viewingCount) {
		this.viewingCount = viewingCount;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
