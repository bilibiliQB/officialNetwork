package com.dute.officialNetwork.api.response.index;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModelProperty;

public class CorporateNewsResponse0 {

	@ApiModelProperty("返回编号")
	private Long id;

	@ApiModelProperty("返回主标题")
	private String mainTitle;

	@ApiModelProperty("返回创建时间")
	@JSONField(format = "yyyy/MM/dd")
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
