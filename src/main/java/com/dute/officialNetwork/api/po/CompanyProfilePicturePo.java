package com.dute.officialNetwork.api.po;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class CompanyProfilePicturePo implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty("ID")
    private Integer id;// ID

    @ApiModelProperty("地址")
    private String picUrl; // 地址

    @ApiModelProperty("排序")
    private Integer picOrder; // 排序

    @ApiModelProperty("创建时间")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date picCreatetime; // 创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getPicOrder() {
        return picOrder;
    }

    public void setPicOrder(Integer picOrder) {
        this.picOrder = picOrder;
    }

    public Date getPicCreatetime() {
        return picCreatetime;
    }

    public void setPicCreatetime(Date picCreatetime) {
        this.picCreatetime = picCreatetime;
    }
}
