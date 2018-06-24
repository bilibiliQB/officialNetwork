package com.dute.officialNetwork.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.alibaba.fastjson.annotation.JSONField;

// 热装楼盘
@Entity
@Table(name = "hot_houses")
@DynamicInsert
@DynamicUpdate
public class HotHouses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hh_id", updatable = false)
	private Long id;// ID

	@Column(name = "hh_name")
	private String name; // 名称

	@Column(name = "hh_introduction")
	private String introduction; // 简介

	@Column(name = "hh_firstpicpath")
	private String firstPicPath; // 首页图

	@Column(name = "hh_average_price")
	private Double averagePrice; // 房屋均价

	@Column(name = "hh_contract_count")
	private Integer contractCount; // 签约户数

	@Column(name = "hh_start_count")
	private Integer startCount; // 开工户数

	@Column(name = "hh_end_count")
	private Integer endCount; // 竣工户数

	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	@Column(name = "hh_create_time")
	private Date createTime; // 创建时间

	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	@Column(name = "hh_modify_time")
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

	public String getFirstPicPath() {
		return firstPicPath;
	}

	public void setFirstPicPath(String firstPicPath) {
		this.firstPicPath = firstPicPath;
	}

	public Double getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(Double averagePrice) {
		this.averagePrice = averagePrice;
	}

	public Integer getContractCount() {
		return contractCount;
	}

	public void setContractCount(Integer contractCount) {
		this.contractCount = contractCount;
	}

	public Integer getStartCount() {
		return startCount;
	}

	public void setStartCount(Integer startCount) {
		this.startCount = startCount;
	}

	public Integer getEndCount() {
		return endCount;
	}

	public void setEndCount(Integer endCount) {
		this.endCount = endCount;
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
