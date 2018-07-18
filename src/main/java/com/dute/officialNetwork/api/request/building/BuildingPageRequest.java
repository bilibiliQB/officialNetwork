package com.dute.officialNetwork.api.request.building;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by zhanghongwei on 2018/7/18.
 */
public class BuildingPageRequest {
    @ApiModelProperty("当前页数")
    private Integer pageNumber;


    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }
}
