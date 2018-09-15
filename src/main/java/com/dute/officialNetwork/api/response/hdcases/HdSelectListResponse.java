package com.dute.officialNetwork.api.response.hdcases;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class HdSelectListResponse {
    @SuppressWarnings("rawtypes")
	@ApiModelProperty("面积筛选集合")
    private List caseAreaList;

    @SuppressWarnings("rawtypes")
	@ApiModelProperty("风格筛选集合")
    private List caseStyleList;

    @SuppressWarnings("rawtypes")
	@ApiModelProperty("大小筛选集合")
    private List caseSizeList;

    @SuppressWarnings("rawtypes")
	public List getCaseAreaList() {
        return caseAreaList;
    }

    @SuppressWarnings("rawtypes")
	public void setCaseAreaList(List caseAreaList) {
        this.caseAreaList = caseAreaList;
    }

    @SuppressWarnings("rawtypes")
	public List getCaseStyleList() {
        return caseStyleList;
    }

    @SuppressWarnings("rawtypes")
	public void setCaseStyleList(List caseStyleList) {
        this.caseStyleList = caseStyleList;
    }

    @SuppressWarnings("rawtypes")
	public List getCaseSizeList() {
        return caseSizeList;
    }

    @SuppressWarnings("rawtypes")
	public void setCaseSizeList(List caseSizeList) {
        this.caseSizeList = caseSizeList;
    }
}
