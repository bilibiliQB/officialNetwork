package com.dute.officialNetwork.service.interfaces.hdcases;

import com.dute.officialNetwork.api.po.HdCasesPo;
import com.dute.officialNetwork.api.request.hdcases.HdCasesRequest;
import com.dute.officialNetwork.api.response.hdcases.HdCasesResponse;
import com.dute.officialNetwork.api.response.hdcases.HdContentResponse;
import com.dute.officialNetwork.api.response.hdcases.HdSelectListResponse;
import com.dute.officialNetwork.domain.entity.HdCases;

import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IHdCasesService {
    HdCasesResponse findByRequest(HdCasesRequest hdCasesRequest);

    HdSelectListResponse findSelectData();

    void updateViewCount(Integer id);
    
    HdCases nextHdCases(Integer id);

    HdCases prvieHdCases(Integer id);

    HdContentResponse getHdContent(Integer id);

    List<HdCasesPo> findByHdCasesStyle(PageRequest pageRequest, String integralDecorationName);
}
