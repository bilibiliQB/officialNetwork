package com.dute.officialNetwork.api.response.building;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/7/18.
 */
public class BuildingDataResponse {
    @ApiModelProperty("热装楼盘列表")
    private List<BuildinglistDataResponse> buildinglistDataResponseList;

    @ApiModelProperty("预约成功记录列表")
    private List<String> applicationRecordList;

    @ApiModelProperty("记录总条数")
    private Long totalNumber;

    public Long getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Long totalNumber) {
        this.totalNumber = totalNumber;
    }

    public List<BuildinglistDataResponse> getBuildinglistDataResponseList() {
        return buildinglistDataResponseList;
    }

    public void setBuildinglistDataResponseList(List<BuildinglistDataResponse> buildinglistDataResponseList) {
        this.buildinglistDataResponseList = buildinglistDataResponseList;
    }

    public List<String> getApplicationRecordList() {
        return applicationRecordList;
    }

    public void setApplicationRecordList(List<String> applicationRecordList) {
        this.applicationRecordList = applicationRecordList;
    }
}
