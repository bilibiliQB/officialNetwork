package com.dute.officialNetwork.domain.entity;

import javax.persistence.Id;
import javax.persistence.Table;
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
	
	@Column(nullable = false,name = "ip")
	private String IP;// IP地址
	
	@Column(nullable = true,name = "name")
	private String name;// 客户姓名
	
	@Column(nullable = false,name = "phone_number")
	private String phoneNumber;// 客户手机号
	
	@Column(nullable = true,name = "problem_description")
	private String problemDescription;// 问题描述
	
	@Column(nullable = true,name = "house_area")
	private Integer houseArea;// 房屋面积
	
	@Column(nullable = true,name = "houses_name")
	private String housesName;// 楼盘名称

	public CustomerInformation() {
	}

	public CustomerInformation(Long id, String IP, String name, String phoneNumber, String problemDescription,
			Integer houseArea, String housesName) {
		super();
		this.id = id;
		this.IP = IP;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.problemDescription = problemDescription;
		this.houseArea = houseArea;
		this.housesName = housesName;
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

	public Integer getHouseArea() {
		return houseArea;
	}

	public void setHouseArea(Integer houseArea) {
		this.houseArea = houseArea;
	}

	public String getHousesName() {
		return housesName;
	}

	public void setHousesName(String housesName) {
		this.housesName = housesName;
	}
}
