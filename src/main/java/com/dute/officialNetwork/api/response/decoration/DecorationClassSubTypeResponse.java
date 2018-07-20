package com.dute.officialNetwork.api.response.decoration;

import io.swagger.annotations.ApiModelProperty;

public class DecorationClassSubTypeResponse {
    @ApiModelProperty("二级分类名称")
    private String subTypeName;

    @ApiModelProperty("二级分裂编号")
    private Integer subTypeId;

    public Integer getSubTypeId() {
        return subTypeId;
    }

    public void setSubTypeId(Integer subTypeId) {
        this.subTypeId = subTypeId;
    }

    public String getSubTypeName() {
        return subTypeName;
    }

    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName;
    }
}
