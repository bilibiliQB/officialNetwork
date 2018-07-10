package com.dute.officialNetwork.api.po;

import com.alibaba.fastjson.annotation.JSONField;
import com.dute.officialNetwork.domain.entity.ProductCaseStructure;
import com.dute.officialNetwork.domain.entity.ProductCaseType;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

public class ProductCasePo implements Serializable {

    @ApiModelProperty("ID")
    private Long id;// ID

    @ApiModelProperty("简介")
    private String shortIntroduction; // 简介

    @ApiModelProperty("面积")
    private Integer area; // 面积

    @ApiModelProperty("首页图")
    private String firstPicPath; // 首页图

    @ApiModelProperty("主标题")
    private String mainTitle; // 主标题

    @ApiModelProperty("副标题")
    private String subTitle; // 副标题

    @ApiModelProperty("作者名称")
    private String authorName; // 作者名称

    @ApiModelProperty("浏览数")
    private Integer viewingCount; // 浏览数

    @ApiModelProperty("详情")
    private String content; // 详情

    @ApiModelProperty("关键字")
    private String keywords; // 关键字

//    @ApiModelProperty("案例类型")
//    private ProductCaseType productCaseType; // 案例类型
//
//    @ApiModelProperty("案例结构")
//    private ProductCaseStructure productCaseStructure; // 案例结构

    @ApiModelProperty("创建时间")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date createTime; // 创建时间

    @ApiModelProperty("修改时间")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date modifyTime; // 修改时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortIntroduction() {
        return shortIntroduction;
    }

    public void setShortIntroduction(String shortIntroduction) {
        this.shortIntroduction = shortIntroduction;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getFirstPicPath() {
        return firstPicPath;
    }

    public void setFirstPicPath(String firstPicPath) {
        this.firstPicPath = firstPicPath;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getViewingCount() {
        return viewingCount;
    }

    public void setViewingCount(Integer viewingCount) {
        this.viewingCount = viewingCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

//    public ProductCaseType getProductCaseType() {
//        return productCaseType;
//    }
//
//    public void setProductCaseType(ProductCaseType productCaseType) {
//        this.productCaseType = productCaseType;
//    }
//
//    public ProductCaseStructure getProductCaseStructure() {
//        return productCaseStructure;
//    }
//
//    public void setProductCaseStructure(ProductCaseStructure productCaseStructure) {
//        this.productCaseStructure = productCaseStructure;
//    }

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
