package com.dute.officialNetwork.api.response.index;

import io.swagger.annotations.ApiModelProperty;

public class TestResponse {
    @ApiModelProperty("返回填写编号")
    private Integer id;

    @ApiModelProperty("返回填写名称")
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
