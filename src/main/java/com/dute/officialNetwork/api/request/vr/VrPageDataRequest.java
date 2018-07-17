package com.dute.officialNetwork.api.request.vr;

import io.swagger.annotations.ApiModelProperty;

public class VrPageDataRequest {
    @ApiModelProperty("当前页数")
    private Integer pageNumber;

    @ApiModelProperty("每页显示数")
    private Integer pageSize;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
