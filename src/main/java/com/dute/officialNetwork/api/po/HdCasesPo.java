package com.dute.officialNetwork.api.po;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class HdCasesPo {
    @ApiModelProperty("ID")
    private Integer id; // ID

    @ApiModelProperty("案例名称")
    private String hdCasesName; // 案例名称

    @ApiModelProperty("案例所属楼盘")
    private String hdBuilding;

    @ApiModelProperty("案例面积")
    private Integer hdCasesArea; // 案例面积

    @ApiModelProperty("案例风格")
    private String hdCasesStyle; // 案例风格

    @ApiModelProperty("案例大小（几居室）")
    private String hdCasesSize; // 案例大小（几居室）

    @ApiModelProperty("案例图片")
    private String hdCasesImgUrl; // 案例图片

    @ApiModelProperty("案例排序")
    private Integer hdCasesOrder; // 案例排序

    @ApiModelProperty("案例创建时间")
    @JSONField(format = "yyyy/MM/dd")
    private Date hdCasesCreateTime; // 案例创建时间

    @ApiModelProperty("案例详情")
    private String hdCasesContent; // 案例详情

    @ApiModelProperty("案例浏览量")
    private Integer hdCasesViewcount; // 案例浏览量

    @ApiModelProperty("案例作者")
    private String hdCasesAuther; // 案例作者

    @ApiModelProperty("案例状态")
    private Integer hdStatus; // 案例状态

    public String getHdBuilding() {
        return hdBuilding;
    }

    public void setHdBuilding(String hdBuilding) {
        this.hdBuilding = hdBuilding;
    }

    public String getHdCasesContent() {
        return hdCasesContent;
    }

    public void setHdCasesContent(String hdCasesContent) {
        this.hdCasesContent = hdCasesContent;
    }

    public Integer getHdCasesViewcount() {
        return hdCasesViewcount;
    }

    public void setHdCasesViewcount(Integer hdCasesViewcount) {
        this.hdCasesViewcount = hdCasesViewcount;
    }

    public String getHdCasesAuther() {
        return hdCasesAuther;
    }

    public void setHdCasesAuther(String hdCasesAuther) {
        this.hdCasesAuther = hdCasesAuther;
    }

    public Integer getHdStatus() {
        return hdStatus;
    }

    public void setHdStatus(Integer hdStatus) {
        this.hdStatus = hdStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHdCasesName() {
        return hdCasesName;
    }

    public void setHdCasesName(String hdCasesName) {
        this.hdCasesName = hdCasesName;
    }

    public Integer getHdCasesArea() {
        return hdCasesArea;
    }

    public void setHdCasesArea(Integer hdCasesArea) {
        this.hdCasesArea = hdCasesArea;
    }

    public String getHdCasesStyle() {
        return hdCasesStyle;
    }

    public void setHdCasesStyle(String hdCasesStyle) {
        this.hdCasesStyle = hdCasesStyle;
    }

    public String getHdCasesSize() {
        return hdCasesSize;
    }

    public void setHdCasesSize(String hdCasesSize) {
        this.hdCasesSize = hdCasesSize;
    }

    public String getHdCasesImgUrl() {
        return hdCasesImgUrl;
    }

    public void setHdCasesImgUrl(String hdCasesImgUrl) {
        this.hdCasesImgUrl = hdCasesImgUrl;
    }

    public Integer getHdCasesOrder() {
        return hdCasesOrder;
    }

    public void setHdCasesOrder(Integer hdCasesOrder) {
        this.hdCasesOrder = hdCasesOrder;
    }

    public Date getHdCasesCreateTime() {
        return hdCasesCreateTime;
    }

    public void setHdCasesCreateTime(Date hdCasesCreateTime) {
        this.hdCasesCreateTime = hdCasesCreateTime;
    }
}
