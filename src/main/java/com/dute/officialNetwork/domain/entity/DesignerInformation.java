package com.dute.officialNetwork.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModelProperty;

// 设计师
@Entity
@Table(name = "designer_information")
public class DesignerInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "di_id", updatable = false)
	@ApiModelProperty("编号[系统生成]")
	private Integer id;// 设计师ID

	@Column(name = "di_name")
	@ApiModelProperty("设计师姓名")
	private String name; // 设计师姓名

	@Column(name = "di_introduction")
	@ApiModelProperty("设计师简介")
	private String introduction; // 设计师简介

	@JSONField(format = "yyyyMMddHHmmss")
	@Column(name = "di_create_time")
	@ApiModelProperty("创建时间[系统生成]")
	private Date createTime; // 创建时间

	@JSONField(format = "yyyyMMddHHmmss")
	@Column(name = "di_modify_time")
	@ApiModelProperty("修改时间[系统生成]")
	private Date modifyTime; // 修改时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

}
