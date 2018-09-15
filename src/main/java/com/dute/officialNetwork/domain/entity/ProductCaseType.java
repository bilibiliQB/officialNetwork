package com.dute.officialNetwork.domain.entity;

import java.io.Serializable;
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

//案例风格[中式,田园......]
@Entity
@Table(name = "product_case_type")
@DynamicInsert
@DynamicUpdate
public class ProductCaseType implements Serializable{

	private static final long serialVersionUID = 6149953267993113079L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pct_id", updatable = false)
	private Integer id;// ID

	@Column(name = "pct_full_name", nullable = false)
	private String fullName; // 全称

	@Column(name = "pct_short_name", nullable = false)
	private String shortName; // 简称

	@Column(name = "pct_english_name", nullable = false)
	private String englishName; // 英语名称

	@Column(name = "pct_short_introduction")
	private String shortIntroduction; // 简评

	@Column(name = "pct_firstpicpath")
	private String firstPicPath; // 首页图

	@Column(name = "pct_price", nullable = false)
	private Integer price; // 每平价格

	@Column(name = "pct_create_time")
	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	private Date createTime; // 创建时间

	@Column(name = "pct_modify_time")
	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	private Date modifyTime; // 修改时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getShortIntroduction() {
		return shortIntroduction;
	}

	public void setShortIntroduction(String shortIntroduction) {
		this.shortIntroduction = shortIntroduction;
	}

	public String getFirstPicPath() {
		return firstPicPath;
	}

	public void setFirstPicPath(String firstPicPath) {
		this.firstPicPath = firstPicPath;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
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
