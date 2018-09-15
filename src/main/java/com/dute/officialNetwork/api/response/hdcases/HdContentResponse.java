package com.dute.officialNetwork.api.response.hdcases;

import com.dute.officialNetwork.api.po.HdCasesPo;
import io.swagger.annotations.ApiModelProperty;

public class HdContentResponse extends HdCasesPo {
    @ApiModelProperty("下一篇")
    private HdCasesPo next;

    @ApiModelProperty("上一篇")
    private HdCasesPo prvie;

    public HdCasesPo getNext() {
        return next;
    }

    public void setNext(HdCasesPo next) {
        this.next = next;
    }

    public HdCasesPo getPrvie() {
        return prvie;
    }

    public void setPrvie(HdCasesPo prvie) {
        this.prvie = prvie;
    }
}
