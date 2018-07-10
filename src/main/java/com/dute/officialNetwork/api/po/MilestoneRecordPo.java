package com.dute.officialNetwork.api.po;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class MilestoneRecordPo {
    @ApiModelProperty("里程碑编号")
    private Long id;// ID

    @ApiModelProperty("里程碑内容")
    private String milestoneContent; // 里程碑内容

    @ApiModelProperty("里程碑时间")
    private Date milestoneTime; // 里程碑时间

    @ApiModelProperty("插入时间")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date milestoneCreateTime; // 插入时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMilestoneContent() {
        return milestoneContent;
    }

    public void setMilestoneContent(String milestoneContent) {
        this.milestoneContent = milestoneContent;
    }

    public Date getMilestoneTime() {
        return milestoneTime;
    }

    public void setMilestoneTime(Date milestoneTime) {
        this.milestoneTime = milestoneTime;
    }

    public Date getMilestoneCreateTime() {
        return milestoneCreateTime;
    }

    public void setMilestoneCreateTime(Date milestoneCreateTime) {
        this.milestoneCreateTime = milestoneCreateTime;
    }
}
