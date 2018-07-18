package com.dute.officialNetwork.api.response.hdcases;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class HdSelectListResponse {
    @ApiModelProperty("面积筛选集合")
    private List caseAreaList;

    @ApiModelProperty("风格筛选集合")
    private List caseStyleList;

    @ApiModelProperty("大小筛选集合")
    private List caseSizeList;

    public List getCaseAreaList() {
        return caseAreaList;
    }

    public void setCaseAreaList(List caseAreaList) {
        this.caseAreaList = caseAreaList;
    }

    public List getCaseStyleList() {
        return caseStyleList;
    }

    public void setCaseStyleList(List caseStyleList) {
        this.caseStyleList = caseStyleList;
    }

    public List getCaseSizeList() {
        return caseSizeList;
    }

    public void setCaseSizeList(List caseSizeList) {
        this.caseSizeList = caseSizeList;
    }
}
