package com.dute.officialNetwork.api.response.banner;

import com.dute.officialNetwork.api.po.BannerTablePo;
import io.swagger.annotations.ApiModelProperty;

public class BannerPicResponse {
    @ApiModelProperty("banner图1")
    private BannerTablePo bannerOne;

    @ApiModelProperty("banner图2")
    private BannerTablePo bannerTwo;

    @ApiModelProperty("banner图3")
    private BannerTablePo bannerThree;

    @ApiModelProperty("banner图4")
    private BannerTablePo bannerFour;

    public BannerTablePo getBannerOne() {
        return bannerOne;
    }

    public void setBannerOne(BannerTablePo bannerOne) {
        this.bannerOne = bannerOne;
    }

    public BannerTablePo getBannerTwo() {
        return bannerTwo;
    }

    public void setBannerTwo(BannerTablePo bannerTwo) {
        this.bannerTwo = bannerTwo;
    }

    public BannerTablePo getBannerThree() {
        return bannerThree;
    }

    public void setBannerThree(BannerTablePo bannerThree) {
        this.bannerThree = bannerThree;
    }

    public BannerTablePo getBannerFour() {
        return bannerFour;
    }

    public void setBannerFour(BannerTablePo bannerFour) {
        this.bannerFour = bannerFour;
    }
}
