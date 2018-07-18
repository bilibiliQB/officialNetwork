package com.dute.officialNetwork.api.response.building;

import com.dute.officialNetwork.api.po.BuildingTablePo;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by zhanghongwei on 2018/7/18.
 */
public class BuildinglistDataResponse extends BuildingTablePo {
    @ApiModelProperty("预约人数")
    private Integer appointmentNumber;

    @ApiModelProperty("开工用户数")
    private Integer operationNumer;

    @ApiModelProperty("竣工用户数")
    private Integer completedNumber;

    public Integer getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(Integer appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public Integer getOperationNumer() {
        return operationNumer;
    }

    public void setOperationNumer(Integer operationNumer) {
        this.operationNumer = operationNumer;
    }

    public Integer getCompletedNumber() {
        return completedNumber;
    }

    public void setCompletedNumber(Integer completedNumber) {
        this.completedNumber = completedNumber;
    }
}
