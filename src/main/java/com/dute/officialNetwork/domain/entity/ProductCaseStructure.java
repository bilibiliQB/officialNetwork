package com.dute.officialNetwork.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private Date create_time; // 创建时间

	@Column(name = "pcs_modify_time")
	private Date modify_time; // 修改时间

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

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getModify_time() {
		return modify_time;
	}

	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}

}
