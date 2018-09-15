package com.dute.officialNetwork.api.po;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by zhanghongwei on 2018/7/10.
 */
public class CooperativePartnerPo {
    @ApiModelProperty("合作机构编号")
    private Integer id;// ID

    @ApiModelProperty("合作品牌图片地址")
    private String cooperativePartnerImg_url; // 合作品牌图片地址

    @ApiModelProperty("合作品牌排序")
    private Integer cooperativePartnerOrder; // 合作品牌排序

    @ApiModelProperty("合作品牌创建时间")
    private Date cooperativePartnerCreateTime; // 合作品牌创建时间

    @ApiModelProperty("合作品牌是否展示")
    private Integer cooperativePartnerIsShow; // 合作品牌是否展示

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCooperativePartnerImg_url() {
        return cooperativePartnerImg_url;
    }

    public void setCooperativePartnerImg_url(String cooperativePartnerImg_url) {
        this.cooperativePartnerImg_url = cooperativePartnerImg_url;
    }

    public Integer getCooperativePartnerOrder() {
        return cooperativePartnerOrder;
    }

    public void setCooperativePartnerOrder(Integer cooperativePartnerOrder) {
        this.cooperativePartnerOrder = cooperativePartnerOrder;
    }

    public Date getCooperativePartnerCreateTime() {
        return cooperativePartnerCreateTime;
    }

    public void setCooperativePartnerCreateTime(Date cooperativePartnerCreateTime) {
        this.cooperativePartnerCreateTime = cooperativePartnerCreateTime;
    }

    public Integer getCooperativePartnerIsShow() {
        return cooperativePartnerIsShow;
    }

    public void setCooperativePartnerIsShow(Integer cooperativePartnerIsShow) {
        this.cooperativePartnerIsShow = cooperativePartnerIsShow;
    }
}
