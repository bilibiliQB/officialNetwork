package com.dute.officialNetwork.domain.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "subscribe_building_fitment")
@DynamicInsert
@DynamicUpdate
public class SubscribeBuildingFitment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subscribe_building_id", updatable = false)
    private Integer id;// ID

    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional = false)
    @JoinColumn(name = "subscribe_building_building_id")
    private BuildingTable buildingTable; // 预约楼盘编号

    @Column(name = "subscribe_building_status")
    private String subscribeBuildingStatus; // 预约状态

    @Column(name = "subscribe_building_create_time")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date subscribeBuildingCreateTime; // 创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BuildingTable getBuildingTable() {
        return buildingTable;
    }

    public void setBuildingTable(BuildingTable buildingTable) {
        this.buildingTable = buildingTable;
    }

    public String getSubscribeBuildingStatus() {
        return subscribeBuildingStatus;
    }

    public void setSubscribeBuildingStatus(String subscribeBuildingStatus) {
        this.subscribeBuildingStatus = subscribeBuildingStatus;
    }

    public Date getSubscribeBuildingCreateTime() {
        return subscribeBuildingCreateTime;
    }

    public void setSubscribeBuildingCreateTime(Date subscribeBuildingCreateTime) {
        this.subscribeBuildingCreateTime = subscribeBuildingCreateTime;
    }
}
