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

// 案例的结构[一室一厅，两室一厅......]
@Entity
@Table(name = "product_case_structure")
public class ProductCaseStructure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pcs_id", updatable = false)
	@ApiModelProperty("案例结构的编号[系统生成]")
	private Long id;// ID

	@Column(name = "pcs_name", nullable = false)
	@ApiModelProperty("结构名称")
	private String name; // 结构名称

	@Column(name = "pcs_create_time")
	@JSONField(format = "yyyyMMddHHmmss")
	@ApiModelProperty("创建时间[系统生成]")
	private Date createTime; // 创建时间

	@Column(name = "pcs_modify_time")
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
