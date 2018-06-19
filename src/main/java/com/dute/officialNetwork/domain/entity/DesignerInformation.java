package com.dute.officialNetwork.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;

// 设计师
@Entity
@Table(name = "designer_information")
public class DesignerInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "di_id", updatable = false)
	private Long id;// 设计师ID

	@Column(name = "di_name")
	private String name; // 设计师姓名

	@Column(name = "di_introduction")
	private String introduction; // 设计师简介

	@JSONField(format = "yyyyMMddHHmmss")
	@Column(name = "di_create_time")
	private Date createTime; // 创建时间

	@JSONField(format = "yyyyMMddHHmmss")
	@Column(name = "di_modify_time")
	private Date modifyTime; // 修改时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Date getModifyTime() {
		return modifyTime;
	}

}
