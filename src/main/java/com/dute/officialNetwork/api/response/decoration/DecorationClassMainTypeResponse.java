package com.dute.officialNetwork.api.response.decoration;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class DecorationClassMainTypeResponse {
    @ApiModelProperty("一级分类名称")
    private String mainTypeName;

    @ApiModelProperty("二级分类列表")
    private List<DecorationClassSubTypeResponse> decorationClassSubTypeResponseList;

    public List<DecorationClassSubTypeResponse> getDecorationClassSubTypeResponseList() {
        return decorationClassSubTypeResponseList;
    }

    public void setDecorationClassSubTypeResponseList(List<DecorationClassSubTypeResponse> decorationClassSubTypeResponseList) {
        this.decorationClassSubTypeResponseList = decorationClassSubTypeResponseList;
    }

    public String getMainTypeName() {

        return mainTypeName;
    }

    public void setMainTypeName(String mainTypeName) {
        this.mainTypeName = mainTypeName;
    }
}
