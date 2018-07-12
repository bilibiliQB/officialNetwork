package com.dute.officialNetwork.service.interfaces.hdcases;

import com.dute.officialNetwork.api.po.HdCasesPo;
import com.dute.officialNetwork.api.request.hdcases.HdCasesRequest;

import java.util.List;

public interface IHdCasesService {
    List<HdCasesPo> findByRequest(HdCasesRequest hdCasesRequest);
}
