package com.dute.officialNetwork.api.po;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class DesignerInformationPo implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty("设计师ID")
    private Integer id;// 设计师ID

    @ApiModelProperty("设计师姓名")
    private String name; // 设计师姓名

    @ApiModelProperty("设计师简介")
    private String introduction; // 设计师简介

    @ApiModelProperty("设计师头像图片")
    private String picPath; // 设计师头像图片

    @ApiModelProperty("设计师工作年限")
    private  String workYear; //设计师工作年限

    @ApiModelProperty("设计师擅长风格")
    private String adeptStyle; //设计师擅长风格

    @ApiModelProperty("设计师水平")
    private String level; //设计师水平

    @ApiModelProperty("创建时间")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date createTime; // 创建时间

    @ApiModelProperty("修改时间")
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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getWorkYear() {
        return workYear;
    }

    public void setWorkYear(String workYear) {
        this.workYear = workYear;
    }

    public String getAdeptStyle() {
        return adeptStyle;
    }

    public void setAdeptStyle(String adeptStyle) {
        this.adeptStyle = adeptStyle;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
