package com.dute.officialNetwork.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//案例风格
@Entity
@Table(name = "product_case_type")
public class ProductCaseType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pct_id", updatable = false)
	private Long id;// ID

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
