package com.dute.officialNetwork.api.response.nav;

import com.dute.officialNetwork.api.response.index.nav.DecorationNavResponse;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/7/30.
 */
public class NavAndTopResponse {
    @ApiModelProperty("导航列表")
    private List<DecorationNavResponse> list;

    @ApiModelProperty("首页顶部广告图")
    private String topPicUrl;

    public List<DecorationNavResponse> getList() {
        return list;
    }

    public void setList(List<DecorationNavResponse> list) {
        this.list = list;
    }

    public String getTopPicUrl() {
        return topPicUrl;
    }

    public void setTopPicUrl(String topPicUrl) {
        this.topPicUrl = topPicUrl;
    }
}
