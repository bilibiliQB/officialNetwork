package com.dute.officialNetwork.domain.entity;

import javax.persistence.Id;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

// 客户信息
@Entity
@Table(name = "customer_information")
public class CustomerInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ci_id", updatable = false)
	@ApiModelProperty("编号[系统生成]")
	private Long id;// ID

	@Column(name = "ci_ip")
	@ApiModelProperty("IP地址[系统生成]")
	private String IP;// IP地址

	@Column(name = "ci_name")
	@ApiModelProperty("客户姓名")
	private String name;// 客户姓名

	@Column(name = "ci_phone_number", nullable = false)
	@ApiModelProperty("客户手机号[必填]")
	private String phoneNumber;// 客户手机号

	@Column(name = "ci_problem_description")
	@ApiModelProperty("问题描述")
	private String problemDescription;// 问题描述

	@Column(name = "ci_house_area")
	@ApiModelProperty("房屋面积")
	private Integer houseArea;// 房屋面积

	@Column(name = "ci_houses_name")
	@ApiModelProperty("楼盘名称")
	private String housesName;// 楼盘名称

	@JSONField(format = "yyyyMMddHHmmss")
	@Column(name = "ci_create_time")
	@ApiModelProperty("创建时间[系统生成]")
	private Date createTime; // 创建时间

	public String getIP() {
		return IP;
	}

	public void setIP(String IP) {
		this.IP = IP;
	}

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProblemDescription() {
		return problemDescription;
	}

	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	public Integer getHouseArea() {
		return houseArea;
	}

	public void setHouseArea(Integer houseArea) {
		this.houseArea = houseArea;
	}

	public String getHousesName() {
		return housesName;
	}

	public Date getCreateTime() {
		return createTime;
	}

}
