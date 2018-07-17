package com.dute.officialNetwork.api.response.hdcases;

import com.dute.officialNetwork.api.po.HdCasesPo;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class HdCasesResponse {
    @ApiModelProperty("高清案例集合")
    private List<HdCasesPo> list;

    @ApiModelProperty("总条数")
    private Long total;

    @ApiModelProperty("总页数")
    private Integer pageTotal;

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
