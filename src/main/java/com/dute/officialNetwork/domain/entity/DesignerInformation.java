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

import io.swagger.annotations.ApiModelProperty;

// 设计师
@Entity
@Table(name = "designer_information")
@DynamicInsert
@DynamicUpdate
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

	@Column(name = "di_pic_path")
	@ApiModelProperty("设计师头像图片")
	private String picPath; // 设计师头像图片

//	@OneToMany(mappedBy = "designerInformation", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@ApiModelProperty("此设计师下的所有VR实景")
//	private List<VRScenes> VRScenes; // 此设计师下的所有VR实景

	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	@Column(name = "di_create_time")
	@ApiModelProperty("创建时间[系统生成]")
	private Date createTime; // 创建时间

	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
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

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

//	public List<VRScenes> getVRScenes() {
//		return VRScenes;
//	}
//
//	public void setVRScenes(List<VRScenes> vRScenes) {
//		VRScenes = vRScenes;
//	}

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
