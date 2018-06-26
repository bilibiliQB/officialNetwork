package com.dute.officialNetwork.api.response.index.nav;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by zhanghongwei on 2018/6/25.
 */
public class DecorationNavResponse {
    @ApiModelProperty("导航栏名称")
    private String tabName;
    @ApiModelProperty("导航栏排序")
    private Integer tabOrder;
    @ApiModelProperty("导航栏对应地址")
    private String tabHerf;

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public Integer getTabOrder() {
        return tabOrder;
    }

    public void setTabOrder(Integer tabOrder) {
        this.tabOrder = tabOrder;
    }

    public String getTabHerf() {
        return tabHerf;
    }

    public void setTabHerf(String tabHerf) {
        this.tabHerf = tabHerf;
    }
}
