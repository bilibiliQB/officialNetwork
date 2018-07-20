package com.dute.officialNetwork.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "house_renovation_pic_table", schema = "officialnetwork")
public class HouseRenovationPicTableEntity {
    private int houseRenovationPicId;
    private Integer houseRenovationPicType;
    private String houseRenovationPicUrl;
    private Integer houseRenovationPicOrder;
    private Timestamp houseRenovationPicCreateTime;

    @Id
    @Column(name = "house_renovation_pic_id")
    public int getHouseRenovationPicId() {
        return houseRenovationPicId;
    }

    public void setHouseRenovationPicId(int houseRenovationPicId) {
        this.houseRenovationPicId = houseRenovationPicId;
    }

    @Basic
    @Column(name = "house_renovation_pic_type")
    public Integer getHouseRenovationPicType() {
        return houseRenovationPicType;
    }

    public void setHouseRenovationPicType(Integer houseRenovationPicType) {
        this.houseRenovationPicType = houseRenovationPicType;
    }

    @Basic
    @Column(name = "house_renovation_pic_url")
    public String getHouseRenovationPicUrl() {
        return houseRenovationPicUrl;
    }

    public void setHouseRenovationPicUrl(String houseRenovationPicUrl) {
        this.houseRenovationPicUrl = houseRenovationPicUrl;
    }

    @Basic
    @Column(name = "house_renovation_pic_order")
    public Integer getHouseRenovationPicOrder() {
        return houseRenovationPicOrder;
    }

    public void setHouseRenovationPicOrder(Integer houseRenovationPicOrder) {
        this.houseRenovationPicOrder = houseRenovationPicOrder;
    }

    @Basic
    @Column(name = "house_renovation_pic_create_time")
    public Timestamp getHouseRenovationPicCreateTime() {
        return houseRenovationPicCreateTime;
    }

    public void setHouseRenovationPicCreateTime(Timestamp houseRenovationPicCreateTime) {
        this.houseRenovationPicCreateTime = houseRenovationPicCreateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseRenovationPicTableEntity that = (HouseRenovationPicTableEntity) o;
        return houseRenovationPicId == that.houseRenovationPicId &&
                Objects.equals(houseRenovationPicType, that.houseRenovationPicType) &&
                Objects.equals(houseRenovationPicUrl, that.houseRenovationPicUrl) &&
                Objects.equals(houseRenovationPicOrder, that.houseRenovationPicOrder) &&
                Objects.equals(houseRenovationPicCreateTime, that.houseRenovationPicCreateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(houseRenovationPicId, houseRenovationPicType, houseRenovationPicUrl, houseRenovationPicOrder, houseRenovationPicCreateTime);
    }
}
