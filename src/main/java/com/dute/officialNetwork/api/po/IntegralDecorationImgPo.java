package com.dute.officialNetwork.api.po;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class IntegralDecorationImgPo {
    @ApiModelProperty("ID")
    private Integer id;// ID

    @ApiModelProperty("图片地址")
    private String integralDecorationImgUrl; // 图片地址

    @ApiModelProperty("插入时间")
    private Date integral_decoration_create_time; // 插入时间

    @ApiModelProperty("图片顺序")
    private Integer integralDecorationOrder; // 图片顺序

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntegralDecorationImgUrl() {
        return integralDecorationImgUrl;
    }

    public void setIntegralDecorationImgUrl(String integralDecorationImgUrl) {
        this.integralDecorationImgUrl = integralDecorationImgUrl;
    }

    public Date getIntegral_decoration_create_time() {
        return integral_decoration_create_time;
    }

    public void setIntegral_decoration_create_time(Date integral_decoration_create_time) {
        this.integral_decoration_create_time = integral_decoration_create_time;
    }

    public Integer getIntegralDecorationOrder() {
        return integralDecorationOrder;
    }

    public void setIntegralDecorationOrder(Integer integralDecorationOrder) {
        this.integralDecorationOrder = integralDecorationOrder;
    }
}
