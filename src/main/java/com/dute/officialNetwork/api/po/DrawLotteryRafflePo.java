package com.dute.officialNetwork.api.po;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class DrawLotteryRafflePo implements Serializable {

	private static final long serialVersionUID = 1760518822400592875L;

	@ApiModelProperty("奖品图片编号")
    private Integer id;// 奖品图片编号

    @ApiModelProperty("奖品图片编号")
    private Integer drawOrder; // 奖品图片编号

    @ApiModelProperty("奖品图片地址")
    private String drawImgUrl; // 奖品图片地址

    @ApiModelProperty("奖品图片创建时间")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date deawCreateTime; // 奖品图片创建时间

    @ApiModelProperty("奖品名称")
    private String drawName; //奖品名称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDrawOrder() {
        return drawOrder;
    }

    public void setDrawOrder(Integer drawOrder) {
        this.drawOrder = drawOrder;
    }

    public String getDrawImgUrl() {
        return drawImgUrl;
    }

    public void setDrawImgUrl(String drawImgUrl) {
        this.drawImgUrl = drawImgUrl;
    }

    public Date getDeawCreateTime() {
        return deawCreateTime;
    }

    public void setDeawCreateTime(Date deawCreateTime) {
        this.deawCreateTime = deawCreateTime;
    }

    public String getDrawName() {
        return drawName;
    }

    public void setDrawName(String drawName) {
        this.drawName = drawName;
    }
}
