package com.dute.officialNetwork.api.response.houserenovation;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class HouseMainDataResponse {

    @ApiModelProperty("优化体系图片列表")
    private List<HouseRenovationPicTableResponse> optimizationSystemList;

    @ApiModelProperty("改造2.0列表")
    private List<HouseRenovationPicTableResponse> transformTwoList;

    @ApiModelProperty("服务流程图片")
    private HouseRenovationPicTableResponse serviceProcess;

    public HouseRenovationPicTableResponse getServiceProcess() {
        return serviceProcess;
    }

    public void setServiceProcess(HouseRenovationPicTableResponse serviceProcess) {
        this.serviceProcess = serviceProcess;
    }

    public List<HouseRenovationPicTableResponse> getOptimizationSystemList() {
        return optimizationSystemList;
    }

    public void setOptimizationSystemList(List<HouseRenovationPicTableResponse> optimizationSystemList) {
        this.optimizationSystemList = optimizationSystemList;
    }

    public List<HouseRenovationPicTableResponse> getTransformTwoList() {
        return transformTwoList;
    }

    public void setTransformTwoList(List<HouseRenovationPicTableResponse> transformTwoList) {
        this.transformTwoList = transformTwoList;
    }
}
