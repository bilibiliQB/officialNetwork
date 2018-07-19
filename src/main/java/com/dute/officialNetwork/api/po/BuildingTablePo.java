package com.dute.officialNetwork.api.po;


import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class BuildingTablePo {
    @ApiModelProperty("ID")
    private Integer id;// ID

    @ApiModelProperty("楼盘名称")
    private String buildingName; // 楼盘名称

    @ApiModelProperty("楼盘图片")
    private String buildingPic; // 楼盘图片

    @ApiModelProperty("楼盘介绍")
    private String buildingContent; // 楼盘介绍

    @ApiModelProperty("排序")
    private Integer buildingOrder; // 排序

    @ApiModelProperty("均价")
    private String buildingAvgPrice; // 均价

    @ApiModelProperty("创建时间")
    private Date buildingCreateTime; // 创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingPic() {
        return buildingPic;
    }

    public void setBuildingPic(String buildingPic) {
        this.buildingPic = buildingPic;
    }

    public String getBuildingContent() {
        return buildingContent;
    }

    public void setBuildingContent(String buildingContent) {
        this.buildingContent = buildingContent;
    }

    public Integer getBuildingOrder() {
        return buildingOrder;
    }

    public void setBuildingOrder(Integer buildingOrder) {
        this.buildingOrder = buildingOrder;
    }

    public String getBuildingAvgPrice() {
        return buildingAvgPrice;
    }

    public void setBuildingAvgPrice(String buildingAvgPrice) {
        this.buildingAvgPrice = buildingAvgPrice;
    }

    public Date getBuildingCreateTime() {
        return buildingCreateTime;
    }

    public void setBuildingCreateTime(Date buildingCreateTime) {
        this.buildingCreateTime = buildingCreateTime;
    }
}
