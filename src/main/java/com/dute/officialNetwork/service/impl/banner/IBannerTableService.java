package com.dute.officialNetwork.service.impl.banner;

import com.dute.officialNetwork.api.po.BannerTablePo;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/7/30.
 */
public interface IBannerTableService {
    List<BannerTablePo> findAllByBannerType(int i);
}
