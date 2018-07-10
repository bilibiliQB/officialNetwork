package com.dute.officialNetwork.domain.entity;

import java.io.Serializable;
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

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.alibaba.fastjson.annotation.JSONField;

// 案例
@Entity
@Table(name = "product_case")
@DynamicInsert
@DynamicUpdate
public class ProductCase implements Serializable {

	private static final long serialVersionUID = 4414576449015047476L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pc_id", updatable = false)
	private Long id;// ID

	@Column(name = "pc_short_introduction")
	private String shortIntroduction; // 简介

	@Column(name = "pc_area")
	private Integer area; // 面积

	@Column(name = "pc_firstpicpath")
	private String firstPicPath; // 首页图

	@Column(name = "pc_main_title")
	private String mainTitle; // 主标题

	@Column(name = "pc_sub_title")
	private String subTitle; // 副标题

	@Column(name = "pc_author_name")
	private String authorName; // 作者名称

	@Column(name = "pc_viewing_count")
	private Integer viewingCount; // 浏览数

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "pc_content")
	private String content; // 详情

	@Column(name = "pc_keywords")
	private String keywords; // 关键字

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional = false)
	@JoinColumn(name = "pc_pct_id")
	private ProductCaseType productCaseType; // 案例类型

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional = false)
	@JoinColumn(name = "pc_pcs_id")
	private ProductCaseStructure productCaseStructure; // 案例结构

	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	@Column(name = "pc_create_time")
	private Date createTime; // 创建时间

	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	@Column(name = "pc_modify_time")
	private Date modifyTime; // 修改时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShortIntroduction() {
		return shortIntroduction;
	}

	public void setShortIntroduction(String shortIntroduction) {
		this.shortIntroduction = shortIntroduction;
	}

	public ProductCaseType getProductCaseType() {
		return productCaseType;
	}

	public void setProductCaseType(ProductCaseType productCaseType) {
		this.productCaseType = productCaseType;
	}

	public ProductCaseStructure getProductCaseStructure() {
		return productCaseStructure;
	}

	public void setProductCaseStructure(ProductCaseStructure productCaseStructure) {
		this.productCaseStructure = productCaseStructure;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
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

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
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
