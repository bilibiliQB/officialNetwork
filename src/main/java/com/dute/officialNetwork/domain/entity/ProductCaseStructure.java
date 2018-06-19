package com.dute.officialNetwork.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;

// 案例的结构[一室一厅，两室一厅......]
@Entity
@Table(name = "product_case_structure")
public class ProductCaseStructure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pcs_id", updatable = false)
	private Long id;// ID

	@Column(name = "pcs_name", nullable = false)
	private String name; // 风格名称

	@Column(name = "pcs_create_time")
	@JSONField(format = "yyyyMMddHHmmss")
	private Date createTime; // 创建时间

	@Column(name = "pcs_modify_time")
	@JSONField(format = "yyyyMMddHHmmss")
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

	public Date getModifyTime() {
		return modifyTime;
	}

}