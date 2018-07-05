package com.dute.officialNetwork.api.response.index.appointmentregistration;

import com.dute.officialNetwork.api.vo.DesingRecord;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/6/26.
 */
public class AppointmentRedistrationResponse {
    @ApiModelProperty("预约人数")
    private Integer designNumber;

    @ApiModelProperty("报价人数")
    private Integer quotedPriceNumber;

    @ApiModelProperty("轮播集合")
    private List<DesingRecord> list;

    public Integer getDesignNumber() {
        return designNumber;
    }

    public void setDesignNumber(Integer designNumber) {
        this.designNumber = designNumber;
    }

    public Integer getQuotedPriceNumber() {
        return quotedPriceNumber;
    }

    public void setQuotedPriceNumber(Integer quotedPriceNumber) {
        this.quotedPriceNumber = quotedPriceNumber;
    }

    public List<DesingRecord> getList() {
        return list;
    }

    public void setList(List<DesingRecord> list) {
        this.list = list;
    }
}
