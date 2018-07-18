package com.dute.officialNetwork.domain.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "building_table")
@DynamicInsert
@DynamicUpdate
public class BuildingTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "building_id", updatable = false)
    private Integer id;// ID

    @Column(name = "building_name")
    private String buildingName; // 楼盘名称

    @Column(name = "building_pic")
    private String buildingPic; // 楼盘图片

    @Column(name = "building_content")
    private String buildingContent; // 楼盘介绍

    @Column(name = "building_order")
    private Integer buildingOrder; // 排序

    @Column(name = "building_avg_price")
    private String buildingAvgPrice; // 均价

    @Column(name = "building_create_time")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date buildingCreateTime; // 创建时间

    @OneToMany(mappedBy = "buildingTable", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SubscribeBuildingFitment> subscribeBuildingFitmentList;   //预约该楼盘的所有用户的信息

    public List<SubscribeBuildingFitment> getSubscribeBuildingFitmentList() {
        return subscribeBuildingFitmentList;
    }

    public void setSubscribeBuildingFitmentList(List<SubscribeBuildingFitment> subscribeBuildingFitmentList) {
        this.subscribeBuildingFitmentList = subscribeBuildingFitmentList;
    }

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
