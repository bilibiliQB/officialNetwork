package com.dute.officialNetwork.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.alibaba.fastjson.annotation.JSONField;

// VR实景 
@Entity
@Table(name = "vr_scenes")
@DynamicInsert
@DynamicUpdate
public class VRScenes implements Serializable{
	
	private static final long serialVersionUID = 2330570824357789306L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vs_id", updatable = false)
	private Long id;// ID

	@Column(name = "vs_name")
	private String name; // 名称

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional = false)
	@JoinColumn(name = "vs_di_id")
	private DesignerInformation designerInformation; // 所属设计师

	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	@Column(name = "vs_create_time")
	private Date createTime; // 创建时间

	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	@Column(name = "vs_modify_time")
	private Date modifyTime; // 修改时间

	@Column(name = "vs_img_url")
	private String vsImgUrl; //VR图片的地址

	@Column(name = "vs_herf_path")
	private String vsHerfPath; //VR地址

	public String getVsImgUrl() {
		return vsImgUrl;
	}

	public void setVsImgUrl(String vsImgUrl) {
		this.vsImgUrl = vsImgUrl;
	}

	public String getVsHerfPath() {
		return vsHerfPath;
	}

	public void setVsHerfPath(String vsHerfPath) {
		this.vsHerfPath = vsHerfPath;
	}

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
