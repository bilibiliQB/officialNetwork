package com.dute.officialNetwork.api.response.main;

import com.dute.officialNetwork.api.response.index.DesignerInformationResponse0;
import com.dute.officialNetwork.api.response.index.ProductCaseResponse0;
import com.dute.officialNetwork.api.response.index.ProductCaseTypeResponse0;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class MainDataListResponse {
    @ApiModelProperty("预约送家电图片")
    private String previews;

    @ApiModelProperty("奖品列表")
    private List<PrizeResponse> prizeList;

    @ApiModelProperty("装修风格列表")
    private List<ProductCaseTypeResponse0> decorationStyleList;

    @ApiModelProperty("业主案例列表")
    private List<ProductCaseResponse0> decorationCaseLsit;

    @ApiModelProperty("VR列表")
    private List<VRResponse> vrList;

    @ApiModelProperty("设计师列表")
    private List<DesignerInformationResponse0> designerInformationList;

    @ApiModelProperty("走进独特列表")
    private List
}
