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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;

// 装修课堂主分类
@Entity
@Table(name = "decoration_class_main_type")
public class DecorationClassMainType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dcm_id", updatable = false)
	private Integer id;// ID

	@Column(name = "dcm_name")
	private String name; // 名称

	@OneToMany(mappedBy = "decorationClassMainType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DecorationClassSubType> decorationClassSubTypes; // 主分类下所有副分类

	@Column(name = "dcm_create_time")
	@JSONField(format = "yyyyMMddHHmmss")
	private Date createTime; // 创建时间

	@Column(name = "dcm_modify_time")
	@JSONField(format = "yyyyMMddHHmmss")
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

	public List<DecorationClassSubType> getDecorationClassSubTypes() {
		return decorationClassSubTypes;
	}

	public void setDecorationClassSubTypes(List<DecorationClassSubType> decorationClassSubTypes) {
		this.decorationClassSubTypes = decorationClassSubTypes;
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
