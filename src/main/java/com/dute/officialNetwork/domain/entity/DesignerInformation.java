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

// 设计师
@Entity
@Table(name = "designer_information")
@DynamicInsert
@DynamicUpdate
public class DesignerInformation implements Serializable{
	
	private static final long serialVersionUID = 1083606926378843279L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "di_id", updatable = false)
	private Integer id;// 设计师ID

	@Column(name = "di_name")
	private String name; // 设计师姓名

	@Column(name = "di_introduction")
	private String introduction; // 设计师简介

	@Column(name = "di_pic_path")
	private String picPath; // 设计师头像图片

	@Column(name = "di_work_year")
	private  String workYear; //设计师工作年限

	@Column(name = "di_adept_style")
	private String adeptStyle; //设计师擅长风格

	@Column(name = "di_level")
	private String level; //设计师水平

	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	@Column(name = "di_create_time")
	private Date createTime; // 创建时间

	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	@Column(name = "di_modify_time")
	private Date modifyTime; // 修改时间

	public String getWorkYear() {
		return workYear;
	}

	public void setWorkYear(String workYear) {
		this.workYear = workYear;
	}

	public String getAdeptStyle() {
		return adeptStyle;
	}

	public void setAdeptStyle(String adeptStyle) {
		this.adeptStyle = adeptStyle;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

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

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
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
