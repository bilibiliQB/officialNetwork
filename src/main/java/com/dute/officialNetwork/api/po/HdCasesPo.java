package com.dute.officialNetwork.api.po;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class HdCasesPo {
    @ApiModelProperty("ID")
    private Integer id; // ID

    @ApiModelProperty("案例名称")
    private String hdCasesName; // 案例名称

    @ApiModelProperty("案例面积")
    private Integer hdCasesArea; // 案例面积

    @ApiModelProperty("案例风格")
    private String hdCasesStyle; // 案例风格

    @ApiModelProperty("案例大小（几居室）")
    private String hdCasesSize; // 案例大小（几居室）

    @ApiModelProperty("案例图片")
    private String hdCasesImgUrl; // 案例图片

    @ApiModelProperty("案例排序")
    private String hdCasesOrder; // 案例排序

    @ApiModelProperty("案例创建时间")
    private Date hdCasesCreateTime; // 案例创建时间

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

    public String getHdCasesOrder() {
        return hdCasesOrder;
    }

    public void setHdCasesOrder(String hdCasesOrder) {
        this.hdCasesOrder = hdCasesOrder;
    }

    public Date getHdCasesCreateTime() {
        return hdCasesCreateTime;
    }

    public void setHdCasesCreateTime(Date hdCasesCreateTime) {
        this.hdCasesCreateTime = hdCasesCreateTime;
    }
}