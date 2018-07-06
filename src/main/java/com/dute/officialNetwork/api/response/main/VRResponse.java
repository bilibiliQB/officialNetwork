package com.dute.officialNetwork.api.response.main;

import io.swagger.annotations.ApiModelProperty;

public class VRResponse {
    @ApiModelProperty("图片地址")
    private String imgUrl;

    @ApiModelProperty("VR实景地址")
    private String vrHrefPath;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getVrHrefPath() {
        return vrHrefPath;
    }

    public void setVrHrefPath(String vrHrefPath) {
        this.vrHrefPath = vrHrefPath;
    }
}
