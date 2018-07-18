package com.dute.officialNetwork.api.request.hdcases;

import io.swagger.annotations.ApiModelProperty;


public class HdCasesRequest {
    @ApiModelProperty("面积")
    private Integer areasFlag;

    @ApiModelProperty("风格")
    private Integer styleFlag;

    @ApiModelProperty("大小")
    private Integer sizeFlag;

    @ApiModelProperty("当前页数")
    private Integer pageNumber;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getAreasFlag() {
        return areasFlag;
    }

    public void setAreasFlag(Integer areasFlag) {
        this.areasFlag = areasFlag;
    }

    public Integer getStyleFlag() {
        return styleFlag;
    }

    public void setStyleFlag(Integer styleFlag) {
        this.styleFlag = styleFlag;
    }

    public Integer getSizeFlag() {
        return sizeFlag;
    }

    public void setSizeFlag(Integer sizeFlag) {
        this.sizeFlag = sizeFlag;
    }
}
