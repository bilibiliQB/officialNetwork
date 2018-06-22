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

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.alibaba.fastjson.annotation.JSONField;

// 装修课堂副分类
@Entity
@Table(name = "decoration_class_sub_type")
@DynamicInsert
@DynamicUpdate
public class DecorationClassSubType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dcs_id", updatable = false)
	private Integer id;// ID

	@Column(name = "dcs_name")
	private String name; // 名称

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional = false)
	@JoinColumn(name = "dcs_dcm_id")
	private DecorationClassMainType decorationClassMainType; // 副分类属于一个主分类

	@OneToMany(mappedBy = "decorationClassSubType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DecorationClass> decorationClass; // 副分类下的所有文章

	@Column(name = "dcs_create_time")
	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	private Date createTime; // 创建时间

	@Column(name = "dcs_modify_time")
	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
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

	public DecorationClassMainType getDecorationClassMainType() {
		return decorationClassMainType;
	}

	public void setDecorationClassMainType(DecorationClassMainType decorationClassMainType) {
		this.decorationClassMainType = decorationClassMainType;
	}

	public List<DecorationClass> getDecorationClass() {
		return decorationClass;
	}

	public void setDecorationClass(List<DecorationClass> decorationClass) {
		this.decorationClass = decorationClass;
	}

}
