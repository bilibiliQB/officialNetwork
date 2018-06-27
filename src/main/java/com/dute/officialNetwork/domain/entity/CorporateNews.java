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

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

//企业新闻
@Entity
@Table(name = "corporate_news")
@DynamicInsert
@DynamicUpdate
public class CorporateNews {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cn_id", updatable = false)
	private Integer id;// ID

	@Column(name = "cn_main_title")
	private String mainTitle; // 主标题

	@Column(name = "cn_sub_title")
	private String subTitle; // 副标题

	@Column(name = "cn_author_name")
	private String authorName; // 作者名称

	@Column(name = "cn_viewing_count")
	private Integer viewingCount; // 浏览数

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "cn_content")
	private String content; // 内容

	@Column(name = "cn_create_time")
	private Date createTime; // 创建时间

	@Column(name = "cn_modify_time")
	private Date modifyTime; // 修改时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMainTitle() {
		return mainTitle;
	}

	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
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
