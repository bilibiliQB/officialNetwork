package com.dute.officialNetwork.domain.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModelProperty;

// 案例的结构[一室一厅，两室一厅......]
@Entity
@Table(name = "product_case_structure")
@DynamicInsert
@DynamicUpdate
public class ProductCaseStructure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pcs_id", updatable = false)
	@ApiModelProperty("案例结构的编号[系统生成]")
	private Integer id;// ID

	@Column(name = "pcs_name", nullable = false)
	@ApiModelProperty("结构名称")
	private String name; // 结构名称

	// @OneToMany(mappedBy = "productCaseStructure", cascade = CascadeType.ALL,
	// fetch = FetchType.LAZY)
	// @ApiModelProperty("此结构下的所有案例")
	// private List<ProductCase> productCase; // 结构下的所有案例

	@Column(name = "pcs_create_time")
	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	@ApiModelProperty("创建时间[系统生成]")
	private Date createTime; // 创建时间

	@Column(name = "pcs_modify_time")
	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	@ApiModelProperty("修改时间[系统生成]")
	private Date modifyTime; // 修改时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// public List<ProductCase> getProductCase() {
	// return productCase;
	// }
	//
	// public void setProductCase(List<ProductCase> productCase) {
	// this.productCase = productCase;
	// }

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
