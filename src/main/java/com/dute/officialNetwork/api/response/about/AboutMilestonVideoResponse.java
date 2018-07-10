package com.dute.officialNetwork.api.response.about;

import com.dute.officialNetwork.api.po.UniqueVedioPo;

import java.util.List;

public class AboutMilestonVideoResponse {
    private List<UniqueVedioPo> list;

    public List<UniqueVedioPo> getList() {
        return list;
    }

    public void setList(List<UniqueVedioPo> list) {
        this.list = list;
    }
}
