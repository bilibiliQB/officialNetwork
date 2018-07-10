package com.dute.officialNetwork.api.po;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class UniqueVedioPo {
    @ApiModelProperty("视屏编号")
    private Long id;// ID
    @ApiModelProperty("视频名称")
    private String uniqueVedioName; // 视频名称
    @ApiModelProperty("视频链接")
    private Date uniqueVedioUrl; // 视频链接
    @ApiModelProperty("排序标识")
    private Integer uniqueVedioOrder;  //排序标识
    @ApiModelProperty("插入时间")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date uniqueVedioCreateTime; // 插入时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUniqueVedioName() {
        return uniqueVedioName;
    }

    public void setUniqueVedioName(String uniqueVedioName) {
        this.uniqueVedioName = uniqueVedioName;
    }

    public Date getUniqueVedioUrl() {
        return uniqueVedioUrl;
    }

    public void setUniqueVedioUrl(Date uniqueVedioUrl) {
        this.uniqueVedioUrl = uniqueVedioUrl;
    }

    public Integer getUniqueVedioOrder() {
        return uniqueVedioOrder;
    }

    public void setUniqueVedioOrder(Integer uniqueVedioOrder) {
        this.uniqueVedioOrder = uniqueVedioOrder;
    }

    public Date getUniqueVedioCreateTime() {
        return uniqueVedioCreateTime;
    }

    public void setUniqueVedioCreateTime(Date uniqueVedioCreateTime) {
        this.uniqueVedioCreateTime = uniqueVedioCreateTime;
    }
}
