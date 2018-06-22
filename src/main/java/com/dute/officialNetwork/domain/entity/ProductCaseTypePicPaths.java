package com.dute.officialNetwork.domain.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModelProperty;

// 案例风格图片
@Entity
@Table(name = "product_case_type_pic_path")
@DynamicInsert
@DynamicUpdate
public class ProductCaseTypePicPaths {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pctp_id", updatable = false)
	@ApiModelProperty("编号[系统生成]")
	private Long id;// ID

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional = false)
	@JoinColumn(name = "pctp_pct_id")
	private ProductCaseType productCaseType; // 所属案例风格

	@Column(name = "pctp_path")
	@ApiModelProperty("图片地址")
	private String path; // 图片地址

	@Column(name = "pctp_create_time")
	@ApiModelProperty("创建时间[系统生成]")
	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	private Date createTime; // 创建时间

	@Column(name = "pctp_modify_time")
	@ApiModelProperty("修改时间[系统生成]")
	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	private Date modifyTime; // 修改时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setProductCaseType(ProductCaseType productCaseType) {
		this.productCaseType = productCaseType;
	}

	public ProductCaseType getProductCaseType() {
		return productCaseType;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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
