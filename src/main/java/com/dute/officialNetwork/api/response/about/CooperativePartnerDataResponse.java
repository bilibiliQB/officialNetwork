package com.dute.officialNetwork.api.response.about;

import com.dute.officialNetwork.api.po.CooperativePartnerPo;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/7/10.
 */
public class CooperativePartnerDataResponse {
    private List<CooperativePartnerPo> list;

    public List<CooperativePartnerPo> getList() {
        return list;
    }

    public void setList(List<CooperativePartnerPo> list) {
        this.list = list;
    }
}
