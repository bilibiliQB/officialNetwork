package com.dute.officialNetwork.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;

// VR实景
@Entity
@Table(name = "vr_scenes")
public class VRScenes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vs_id", updatable = false)
	private Long id;// ID

	@Column(name = "vs_name")
	private String name; // 名称

	@OneToOne
	@JoinColumn(name = "vs_di_id", nullable = false)
	private DesignerInformation designerInformation; // 所属设计师

	@JSONField(format = "yyyyMMddHHmmss")
	@Column(name = "vs_create_time")
	private Date createTime; // 创建时间

	@JSONField(format = "yyyyMMddHHmmss")
	@Column(name = "vs_modify_time")
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

	public DesignerInformation getDesignerInformation() {
		return designerInformation;
	}

	public void setDesignerInformation(DesignerInformation designerInformation) {
		this.designerInformation = designerInformation;
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
