package com.dute.officialNetwork.service.interfaces.nav;

import com.dute.officialNetwork.api.response.index.nav.DecorationNavResponse;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/6/25.
 */
public interface IDecortionNavService {
    List<DecorationNavResponse> findAllByTabShow(int i);
}

