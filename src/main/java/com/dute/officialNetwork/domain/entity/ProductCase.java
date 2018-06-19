package com.dute.officialNetwork.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// 案例
@Entity
@Table(name = "product_case")
public class ProductCase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pc_id", updatable = false)
	private Long id;// ID

	@OneToOne
	@JoinColumn(name = "pc_pct_id", nullable = false)
	private ProductCaseType productCaseType; // 案例类型

	@OneToOne
	@JoinColumn(name = "pc_pcs_id", nullable = false)
	private ProductCaseStructure productCaseStructure; // 案例结构

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

}
