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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

	@Column(name = "pc_name")
	@ApiModelProperty("名称")
	private String name;

	@Column(name = "pc_area")
	@ApiModelProperty("面积m²")
	private Integer area; // 面积

	@Column(name = "pc_firstpicpath")
	@ApiModelProperty("首页图")
	private String firstPicPath; // 首页图

	@OneToMany(mappedBy = "productCase", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@ApiModelProperty("扩展图片")
	private List<ProductCasePicPaths> productCasePicPaths; // 扩展图片

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional = false)
	@JoinColumn(name = "pc_pct_id")
	private ProductCaseType productCaseType; // 案例类型

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional = false)
	@JoinColumn(name = "pc_pcs_id")
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<ProductCasePicPaths> getProductCasePicPaths() {
		return productCasePicPaths;
	}

	public void setProductCasePicPaths(List<ProductCasePicPaths> productCasePicPaths) {
		this.productCasePicPaths = productCasePicPaths;
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
