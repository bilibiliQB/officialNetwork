package com.dute.officialNetwork.api.response.integraldecoration;

import com.dute.officialNetwork.api.po.IntegralDecorationPo;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class IntegralDecorationResponse {
    @ApiModelProperty("整装集合")
    private List<IntegralDecorationPo> list;

    public List<IntegralDecorationPo> getList() {
        return list;
    }

    public void setList(List<IntegralDecorationPo> list) {
        this.list = list;
    }
}
