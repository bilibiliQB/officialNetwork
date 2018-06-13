package com.dute.officialNetwork.domain.entity;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class CustomerInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false)
	private Long id;// ID
	
	@Column(nullable = true,name = "name")
	private String name;// 客户姓名
	
	@Column(nullable = false,name = "phonenumber")
	private String phoneNumber;// 客户手机号
	
	@Column(nullable = true,name = "problemdescription")
	private String problemDescription;// 问题描述
	
	@Column(nullable = true,name = "housearea")
	private Integer houseArea;// 房屋面积
	
	@Column(nullable = true,name = "propertyname")
	private String propertyName;// 楼盘名称

	public CustomerInformation() {
	}

	public CustomerInformation(Long id, String name, String phoneNumber, String problemDescription, Integer houseArea,
			String propertyName) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.problemDescription = problemDescription;
		this.houseArea = houseArea;
		this.propertyName = propertyName;
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

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
}
