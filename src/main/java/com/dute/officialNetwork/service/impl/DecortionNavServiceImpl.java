package com.dute.officialNetwork.service.impl;

import com.dute.officialNetwork.api.response.index.nav.DecorationNavResponse;
import com.dute.officialNetwork.domain.entity.DecorationNav;
import com.dute.officialNetwork.domain.repository.DecortionNavRespository;
import com.dute.officialNetwork.service.IDecortionNavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhanghongwei on 2018/6/25.
 */
@Service
public class DecortionNavServiceImpl implements IDecortionNavService {
    @Autowired
    private DecortionNavRespository decortionNavRespository;

    @Override
    public List<DecorationNavResponse> findAllByTabShow(int i) {
        List<DecorationNav> allByTabShow = decortionNavRespository.findAllByTabShowOrderByTabOrderAsc(i);
        List<DecorationNavResponse> list = new ArrayList<>();
        if(allByTabShow != null && allByTabShow.size() > 0){
            for (DecorationNav decorationNavEntity : allByTabShow) {
                DecorationNavResponse decorationNavResponse = new DecorationNavResponse();
                decorationNavResponse.setTabName(decorationNavEntity.getTabName());
                decorationNavResponse.setTabHerf(decorationNavEntity.getTabHerf());
                decorationNavResponse.setTabOrder(decorationNavEntity.getTabOrder());
                list.add(decorationNavResponse);
            }
        }
        return list;
    }
}
