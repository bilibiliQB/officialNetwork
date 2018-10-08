package com.dute.officialNetwork.api.response.decoration;

import io.swagger.annotations.ApiModelProperty;
import java.util.List;

public class DecorationMainTypeAndSubTypeResponse {
    @ApiModelProperty("分类列表")
    private List<DecorationClassMainTypeResponse> decorationClassMainTypeResponseList;

    public List<DecorationClassMainTypeResponse> getDecorationClassMainTypeList() {
        return decorationClassMainTypeResponseList;
    }

    public void setDecorationClassMainTypeList(List<DecorationClassMainTypeResponse> decorationClassMainTypeResponseList) {
        this.decorationClassMainTypeResponseList = decorationClassMainTypeResponseList;
    }
}
