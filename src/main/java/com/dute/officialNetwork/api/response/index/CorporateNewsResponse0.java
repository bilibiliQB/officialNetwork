package com.dute.officialNetwork.api.response.index;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModelProperty;

public class CorporateNewsResponse0 {

	@ApiModelProperty("返回编号")
	private Integer id;

	@ApiModelProperty("返回主标题")
	private String mainTitle;

	@ApiModelProperty("返回创建时间(年月)")
	@JSONField(format = "yyyy/MM")
	private Date createTimeYearAndMonth;

	@ApiModelProperty("返回创建时间(年月)")
	@JSONField(format = "dd")
	private Date createTimeDay;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMainTitle() {
		return mainTitle;
	}

	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}

	public Date getCreateTimeYearAndMonth() {
		return createTimeYearAndMonth;
	}

	public void setCreateTimeYearAndMonth(Date createTimeYearAndMonth) {
		this.createTimeYearAndMonth = createTimeYearAndMonth;
	}

	public Date getCreateTimeDay() {
		return createTimeDay;
	}

	public void setCreateTimeDay(Date createTimeDay) {
		this.createTimeDay = createTimeDay;
	}
}
