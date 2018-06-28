package com.dute.officialNetwork.domain.entity;

import java.io.Serializable;
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

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.alibaba.fastjson.annotation.JSONField;

//业主故事
@Entity
@Table(name = "owner_story")
@DynamicInsert
@DynamicUpdate
public class OwnerStory implements Serializable{

	private static final long serialVersionUID = 1498602281132402965L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "os_id", updatable = false)
	private Long id;// ID

	@Column(name = "os_firstpicpath")
	private String firstPicPath; // 首页图

	@Column(name = "os_main_title")
	private String mainTitle; // 主标题

	@Column(name = "os_sub_title")
	private String subTitle; // 副标题

	@Column(name = "os_author_name")
	private String authorName; // 作者名称

	@Column(name = "os_viewing_count")
	private Integer viewingCount; // 浏览数

	@Column(name = "os_keywords")
	private String keywords; // 关键字

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "os_content")
	private String content; // 内容

	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	@Column(name = "os_create_time")
	private Date createTime; // 创建时间

	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
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

	public String getMainTitle() {
		return mainTitle;
	}

	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Integer getViewingCount() {
		return viewingCount;
	}

	public void setViewingCount(Integer viewingCount) {
		this.viewingCount = viewingCount;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
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
