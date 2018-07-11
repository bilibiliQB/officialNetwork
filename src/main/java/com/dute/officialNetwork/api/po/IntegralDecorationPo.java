package com.dute.officialNetwork.api.po;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

public class IntegralDecorationPo {
    @ApiModelProperty("ID")
    private Integer id;// ID

    @ApiModelProperty("整装名称")
    private String IntegralDecorationName; // 整装名称

    @ApiModelProperty("整装英文名称")
    private String IntegralDecorationEnglishName; // 整装英文名称

    @ApiModelProperty("整装描述数组")
    private String[] IntegralDecorationContents; // 整装描述

    @ApiModelProperty("整装价格")
    private Integer IntegralDecorationPrice; //整装价格

    @ApiModelProperty("整装价格单位")
    private String IntegralDecorationUnit; //整装价格单位

    @ApiModelProperty("整装面积单位")
    private String IntegralDecorationAreaUnit; //整装面积单位

    @ApiModelProperty("整装数据插入时间")
    private Date IntegralDecorationCreateTime; //整装数据插入时间

    @ApiModelProperty("整装排序")
    private Integer IntegralDecorationOrder; //整装排序

    @ApiModelProperty("整装是否展示")
    private Integer IntegralDecorationIsShow; //整装是否展示

    @ApiModelProperty("整装图片集合")
    private List<IntegralDecorationImgPo> integralDecorationImgList;   //整装图片集合

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntegralDecorationName() {
        return IntegralDecorationName;
    }

    public void setIntegralDecorationName(String integralDecorationName) {
        IntegralDecorationName = integralDecorationName;
    }

    public String getIntegralDecorationEnglishName() {
        return IntegralDecorationEnglishName;
    }

    public void setIntegralDecorationEnglishName(String integralDecorationEnglishName) {
        IntegralDecorationEnglishName = integralDecorationEnglishName;
    }

    public String[] getIntegralDecorationContents() {
        return IntegralDecorationContents;
    }

    public void setIntegralDecorationContents(String[] integralDecorationContents) {
        IntegralDecorationContents = integralDecorationContents;
    }

    public Integer getIntegralDecorationPrice() {
        return IntegralDecorationPrice;
    }

    public void setIntegralDecorationPrice(Integer integralDecorationPrice) {
        IntegralDecorationPrice = integralDecorationPrice;
    }

    public String getIntegralDecorationUnit() {
        return IntegralDecorationUnit;
    }

    public void setIntegralDecorationUnit(String integralDecorationUnit) {
        IntegralDecorationUnit = integralDecorationUnit;
    }

    public String getIntegralDecorationAreaUnit() {
        return IntegralDecorationAreaUnit;
    }

    public void setIntegralDecorationAreaUnit(String integralDecorationAreaUnit) {
        IntegralDecorationAreaUnit = integralDecorationAreaUnit;
    }

    public Date getIntegralDecorationCreateTime() {
        return IntegralDecorationCreateTime;
    }

    public void setIntegralDecorationCreateTime(Date integralDecorationCreateTime) {
        IntegralDecorationCreateTime = integralDecorationCreateTime;
    }

    public Integer getIntegralDecorationOrder() {
        return IntegralDecorationOrder;
    }

    public void setIntegralDecorationOrder(Integer integralDecorationOrder) {
        IntegralDecorationOrder = integralDecorationOrder;
    }

    public Integer getIntegralDecorationIsShow() {
        return IntegralDecorationIsShow;
    }

    public void setIntegralDecorationIsShow(Integer integralDecorationIsShow) {
        IntegralDecorationIsShow = integralDecorationIsShow;
    }

    public List<IntegralDecorationImgPo> getIntegralDecorationImgList() {
        return integralDecorationImgList;
    }

    public void setIntegralDecorationImgList(List<IntegralDecorationImgPo> integralDecorationImgList) {
        this.integralDecorationImgList = integralDecorationImgList;
    }
}
