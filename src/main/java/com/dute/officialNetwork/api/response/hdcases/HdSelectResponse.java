package com.dute.officialNetwork.api.response.hdcases;

import io.swagger.annotations.ApiModelProperty;

public class HdSelectResponse {
    @ApiModelProperty("标志")
    private Integer falg;

    @ApiModelProperty("文本内容")
    private String name;

    public Integer getFalg() {
        return falg;
    }

    public void setFalg(Integer falg) {
        this.falg = falg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
