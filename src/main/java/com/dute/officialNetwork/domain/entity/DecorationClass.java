package com.dute.officialNetwork.domain.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.alibaba.fastjson.annotation.JSONField;

//装修课堂
@Entity
@Table(name = "decoration_class")
@DynamicInsert
@DynamicUpdate
public class DecorationClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dc_id", updatable = false)
	private Long id;// ID

	@Column(name = "dc_main_title")
	private String mainTitle; // 主标题

	@Column(name = "dc_introduction")
	private String introduction; // 简介

	@Column(name = "dc_firstpicpath")
	private String firstPicPath; // 首页图

	@Column(name = "dc_author_name")
	private String authorName; // 作者名称

	@Column(name = "dc_viewing_count")
	private Integer viewingCount; // 浏览数

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional = false)
	@JoinColumn(name = "dc_dcs_id")
	private DecorationClassSubType decorationClassSubType; // 所属副分类

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "dc_content")
	private String content; // 内容

	@Column(name = "dc_create_time")
	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	private Date createTime; // 创建时间

	@Column(name = "dc_modify_time")
	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	private Date modifyTime; // 修改时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMainTitle() {
		return mainTitle;
	}

	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
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

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getViewingCount() {
		return viewingCount;
	}

	public void setViewingCount(Integer viewingCount) {
		this.viewingCount = viewingCount;
	}

	public DecorationClassSubType getDecorationClassSubType() {
		return decorationClassSubType;
	}

	public void setDecorationClassSubType(DecorationClassSubType decorationClassSubType) {
		this.decorationClassSubType = decorationClassSubType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
