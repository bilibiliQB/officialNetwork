package com.dute.officialNetwork.api.response.main;

import io.swagger.annotations.ApiModelProperty;

public class PrizeResponse {

    @ApiModelProperty("奖品名称")
    private String prizeName;

    @ApiModelProperty("奖品图片地址")
    private String prizePicUrl;

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String getPrizePicUrl() {
        return prizePicUrl;
    }

    public void setPrizePicUrl(String prizePicUrl) {
        this.prizePicUrl = prizePicUrl;
    }
}
