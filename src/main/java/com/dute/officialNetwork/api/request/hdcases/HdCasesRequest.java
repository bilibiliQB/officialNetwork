package com.dute.officialNetwork.api.request.hdcases;

import io.swagger.annotations.ApiModelProperty;


public class HdCasesRequest {
    @ApiModelProperty("面积")
    private String areas;

    @ApiModelProperty("风格")
    private String style;

    @ApiModelProperty("大小")
    private String size;

    @ApiModelProperty("当前页数")
    private Integer pageNumber;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
