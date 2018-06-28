package com.dute.officialNetwork.domain.entity;

import java.io.Serializable;
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

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.alibaba.fastjson.annotation.JSONField;

//全局图片组
@Entity
@Table(name = "global_pic_group")
@DynamicInsert
@DynamicUpdate
public class GlobalPicGroup implements Serializable{

	private static final long serialVersionUID = 6023259009505812647L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gpg_id", updatable = false)
	private Integer id; // ID

	@Column(name = "gpg_name")
	private String name; // 组名

	@OneToMany(mappedBy = "globalPicGroup", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<GlobalPicPath> globalPicPaths; // 获取该组下的所有图片

	@Column(name = "gpg_create_time")
	@JSONField(format = "yyyy/MM/dd HH:mm:ss")
	private Date createTime; // 创建时间

	@Column(name = "gpg_modify_time")
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

	public List<GlobalPicPath> getGlobalPicPaths() {
		return globalPicPaths;
	}

	public void setGlobalPicPaths(List<GlobalPicPath> globalPicPaths) {
		this.globalPicPaths = globalPicPaths;
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
