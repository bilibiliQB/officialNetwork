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
	@Column(name = "id", updatable = false)
	@ApiModelProperty("编号")
	private Long id;// ID

	@Column(name = "ip")
	@ApiModelProperty("IP地址")
	private String IP;// IP地址

	@Column(name = "name")
	@ApiModelProperty("客户姓名")
	private String name;// 客户姓名

	@Column(name = "phone_number")
	@ApiModelProperty("客户手机号")
	private String phoneNumber;// 客户手机号

	@Column(name = "problem_description")
	@ApiModelProperty("问题描述")
	private String problemDescription;// 问题描述

	@Column(name = "house_area")
	@ApiModelProperty("房屋面积")
	private String houseArea;// 房屋面积

	@Column(name = "houses_name")
	@ApiModelProperty("楼盘名称")
	private String housesName;// 楼盘名称

	@JSONField(format = "yyyyMMddHHmmss")
	@Column(name = "create_time")
	@ApiModelProperty("创建时间")
	private Date createTime; // 创建时间

	public CustomerInformation() {
	}

	public CustomerInformation(Long id, String IP, String name, String phoneNumber, String problemDescription,
			String houseArea, String housesName, Date createTime) {
		this.id = id;
		this.IP = IP;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.problemDescription = problemDescription;
		this.houseArea = houseArea;
		this.housesName = housesName;
		this.createTime = createTime;
	}

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

	public String getHouseArea() {
		return houseArea;
	}

	public void setHouseArea(String houseArea) {
		this.houseArea = houseArea;
	}

	public String getHousesName() {
		return housesName;
	}

	public void setHousesName(String housesName) {
		this.housesName = housesName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
