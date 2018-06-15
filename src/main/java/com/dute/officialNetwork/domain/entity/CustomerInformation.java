package com.dute.officialNetwork.domain.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.alibaba.fastjson.annotation.JSONField;

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
	private Long id;// ID

	@Column(name = "ip")
	private String IP;// IP地址

	@Column(name = "name")
	@Size(max = 20, message = "姓名不得超过20个字符")
	private String name;// 客户姓名

	@Column(name = "phone_number")
	@NotBlank(message = "手机号必须填写")
	@Pattern(regexp = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$", message = "手机号格式错误")
	private String phoneNumber;// 客户手机号

	@Column(name = "problem_description")
	@Size(max = 255, message = "问题描述不得超过255字符")
	private String problemDescription;// 问题描述

	@Column(name = "house_area")
	@Size(max = 5, message = "房屋面积不得超过5个字符")
	@Pattern(regexp = "^[0-9]*$", message = "房屋面积只能输入纯数字")
	private String houseArea;// 房屋面积

	@Column(name = "houses_name")
	@Size(max = 20, message = "楼盘名称不得超过20个字符")
	private String housesName;// 楼盘名称

	@JSONField(format = "yyyyMMddHHmmss")
	@Column(name = "create_time")
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
