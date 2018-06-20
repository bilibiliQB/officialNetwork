package com.dute.officialNetwork.domain.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModelProperty;

//案例风格[中式,田园......]
@Entity
@Table(name = "product_case_type")
public class ProductCaseType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pct_id", updatable = false)
	@ApiModelProperty("风格编号[系统生成]")
	private Long id;// ID

	@Column(name = "pct_name", nullable = false)
	@ApiModelProperty("风格名称")
	private String name; // 风格名称

	@OneToMany(mappedBy = "productCaseType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@ApiModelProperty("此风格下的所有案例")
	private List<ProductCase> ProductCase;

	@OneToMany(mappedBy = "productCaseType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@ApiModelProperty("此风格下的图片")
	private List<ProductCaseTypePicPaths> ProductCaseTypePicPaths; // 此风格下的所有图片

	@Column(name = "pct_create_time")
	@JSONField(format = "yyyyMMddHHmmss")
	@ApiModelProperty("创建时间[系统生成]")
	private Date createTime; // 创建时间

	@Column(name = "pct_modify_time")
	@JSONField(format = "yyyyMMddHHmmss")
	@ApiModelProperty("修改时间[系统生成]")
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

	public List<ProductCase> getProductCase() {
		return ProductCase;
	}

	public void setProductCase(List<ProductCase> productCase) {
		ProductCase = productCase;
	}

	public List<ProductCaseTypePicPaths> getProductCaseTypePicPaths() {
		return ProductCaseTypePicPaths;
	}

	public void setProductCaseTypePicPaths(List<ProductCaseTypePicPaths> productCaseTypePicPaths) {
		ProductCaseTypePicPaths = productCaseTypePicPaths;
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
