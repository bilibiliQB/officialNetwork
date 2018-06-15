package com.dute.officialNetwork.api.request.index;

import io.swagger.annotations.ApiModelProperty;

public class TestRequest {
    @ApiModelProperty("填写编号")
    private Integer id;

    @ApiModelProperty("填写名称")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
