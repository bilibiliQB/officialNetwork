package com.dute.officialNetwork.service.interfaces.hdcases;

import com.dute.officialNetwork.api.request.hdcases.HdCasesRequest;
import com.dute.officialNetwork.api.response.hdcases.HdCasesResponse;

public interface IHdCasesService {
    HdCasesResponse findByRequest(HdCasesRequest hdCasesRequest);
}
