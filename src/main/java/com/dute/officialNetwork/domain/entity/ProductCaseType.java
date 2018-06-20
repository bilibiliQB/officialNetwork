package com.dute.officialNetwork.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
