package com.dute.officialNetwork.domain.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;

//业主故事
@Entity
@Table(name = "owner_story")
public class OwnerStory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "os_id", updatable = false)
	private Long id;// ID

	@Column(name = "os_firstpicpath")
	private String firstPicPath; // 首页图

	@Column(name = "os_title")
	private String title; // 标题

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "os_content")
	private String content; // 内容

	@JSONField(format = "yyyyMMddHHmmss")
	@Column(name = "os_create_time")
	private Date createTime; // 创建时间

	@JSONField(format = "yyyyMMddHHmmss")
	@Column(name = "os_modify_time")
	private Date modifyTime; // 修改时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstPicPath() {
		return firstPicPath;
	}

	public void setFirstPicPath(String firstPicPath) {
		this.firstPicPath = firstPicPath;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
