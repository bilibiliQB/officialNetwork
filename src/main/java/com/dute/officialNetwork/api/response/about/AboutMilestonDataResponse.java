package com.dute.officialNetwork.api.response.about;

import com.dute.officialNetwork.api.po.MilestoneRecordPo;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class AboutMilestonDataResponse {
    @ApiModelProperty("里程碑集合")
    private List<MilestoneRecordPo> list;

    public List<MilestoneRecordPo> getList() {
        return list;
    }

    public void setList(List<MilestoneRecordPo> list) {
        this.list = list;
    }
}
