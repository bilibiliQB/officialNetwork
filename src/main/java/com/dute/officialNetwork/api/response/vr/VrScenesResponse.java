package com.dute.officialNetwork.api.response.vr;

import com.dute.officialNetwork.api.po.VRScenesPo;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class VrScenesResponse {
    @ApiModelProperty("vr数据")
    private List<VRScenesPo> list;

    @ApiModelProperty("总条数")
    private Long totalNum;

    public List<VRScenesPo> getList() {
        return list;
    }

    public void setList(List<VRScenesPo> list) {
        this.list = list;
    }

    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }
}
