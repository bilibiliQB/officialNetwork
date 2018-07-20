package com.dute.officialNetwork.api.po;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

public class HouseRenovationPicTablePo {
    @ApiModelProperty("编号")
    private int houseRenovationPicId;

    @ApiModelProperty("类型")
    private Integer houseRenovationPicType;

    @ApiModelProperty("图片地址")
    private String houseRenovationPicUrl;

    @ApiModelProperty("排序")
    private Integer houseRenovationPicOrder;

    @ApiModelProperty("创建时间")
    private Timestamp houseRenovationPicCreateTime;

    public Integer getHouseRenovationPicType() {
        return houseRenovationPicType;
    }

    public void setHouseRenovationPicType(Integer houseRenovationPicType) {
        this.houseRenovationPicType = houseRenovationPicType;
    }

    public String getHouseRenovationPicUrl() {
        return houseRenovationPicUrl;
    }

    public void setHouseRenovationPicUrl(String houseRenovationPicUrl) {
        this.houseRenovationPicUrl = houseRenovationPicUrl;
    }

    public Integer getHouseRenovationPicOrder() {
        return houseRenovationPicOrder;
    }

    public void setHouseRenovationPicOrder(Integer houseRenovationPicOrder) {
        this.houseRenovationPicOrder = houseRenovationPicOrder;
    }

    public Timestamp getHouseRenovationPicCreateTime() {
        return houseRenovationPicCreateTime;
    }

    public void setHouseRenovationPicCreateTime(Timestamp houseRenovationPicCreateTime) {
        this.houseRenovationPicCreateTime = houseRenovationPicCreateTime;
    }

    public int getHouseRenovationPicId() {

        return houseRenovationPicId;
    }

    public void setHouseRenovationPicId(int houseRenovationPicId) {
        this.houseRenovationPicId = houseRenovationPicId;
    }
}
