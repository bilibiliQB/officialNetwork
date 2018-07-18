package com.dute.officialNetwork.api.response.hdcases;

import com.dute.officialNetwork.api.po.HdCasesPo;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class HdCasesResponse {
    @ApiModelProperty("面积筛选集合")
    private List caseAreaList;

    @ApiModelProperty("风格筛选集合")
    private List caseStyleList;

    @ApiModelProperty("大小筛选集合")
    private List caseSizeList;

    @ApiModelProperty("高清案例集合")
    private List<HdCasesPo> list;

    @ApiModelProperty("总条数")
    private Long total;

    @ApiModelProperty("总页数")
    private Integer pageTotal;

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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public List<HdCasesPo> getList() {
        return list;
    }

    public void setList(List<HdCasesPo> list) {
        this.list = list;
    }
}
