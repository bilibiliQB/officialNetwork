package com.dute.officialNetwork.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModelProperty;

// 案例
@Entity
@Table(name = "product_case")
public class ProductCase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pc_id", updatable = false)
	@ApiModelProperty("编号[系统生成]")
	private Long id;// ID

	@Column(name = "pc_area")
	@ApiModelProperty("面积m²")
	private Integer area; // 面积

	@OneToOne
	@JoinColumn(name = "pc_pct_id", nullable = false)
	private ProductCaseType productCaseType; // 案例类型

	@OneToOne
	@JoinColumn(name = "pc_pcs_id", nullable = false)
	private ProductCaseStructure productCaseStructure; // 案例结构

	@JSONField(format = "yyyyMMddHHmmss")
	@Column(name = "pc_create_time")
	@ApiModelProperty("创建时间[系统生成]")
	private Date createTime; // 创建时间
	
	@JSONField(format = "yyyyMMddHHmmss")
	@Column(name = "pc_modify_time")
	@ApiModelProperty("修改时间[系统生成]")
	private Date modifyTime; // 修改时间
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
