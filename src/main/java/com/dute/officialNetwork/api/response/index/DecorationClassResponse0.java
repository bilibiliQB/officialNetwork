package com.dute.officialNetwork.api.response.index;

import io.swagger.annotations.ApiModelProperty;

public class DecorationClassResponse0 {

	@ApiModelProperty("返回装修课堂文章的ID")
	private Long id;// ID

	@ApiModelProperty("返回装修课堂文章的标题")
	private String mainTitle; // 主标题

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
	
}
