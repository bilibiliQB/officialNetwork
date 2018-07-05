package com.dute.officialNetwork.api.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by zhanghongwei on 2018/7/5.
 */
public class DesingRecord {
    @ApiModelProperty("记录描述")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public DesingRecord(String content) {
        this.content = content;
    }

    public DesingRecord() {
    }
}
