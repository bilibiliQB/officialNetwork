package com.dute.officialNetwork.domain.entity;


import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hd_cases")
@DynamicUpdate
@DynamicInsert
public class HdCases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hd_cases_id", updatable = false)
    private Integer id; // ID

    @Column(name = "hd_cases_name")
    private String hdCasesName; // 案例名称

    @Column(name = "hd_building")
    private String hdBuilding;

    @Column(name = "hd_cases_area")
    private Integer hdCasesArea; // 案例面积

    @JoinColumn(name = "hd_cases_style")
    private String hdCasesStyle; // 案例风格

    @Column(name = "hd_cases_size")
    private String hdCasesSize; // 案例大小（几居室）

    @Column(name = "hd_cases_img_url")
    private String hdCasesImgUrl; // 案例图片

    @Column(name = "hd_cases_order")
    private Integer hdCasesOrder; // 案例排序

    @Column(name = "hd_cases_create_time")
    @JSONField(format = "yyyy/MM/dd")
    private Date hdCasesCreateTime; // 案例创建时间

    @Column(name = "hd_cases_content")
    private String hdCasesContent; // 案例详情

    @Column(name = "hd_cases_viewcount")
    private Integer hdCasesViewcount; // 案例浏览量

    @Column(name = "hd_cases_auther")
    private String hdCasesAuther; // 案例作者

    @Column(name = "hd_status")
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
