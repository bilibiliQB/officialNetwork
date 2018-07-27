package com.dute.officialNetwork.service.interfaces;

import com.dute.officialNetwork.api.po.VRScenesPo;
import com.dute.officialNetwork.api.request.vr.VrPageDataRequest;
import com.dute.officialNetwork.api.response.vr.VrScenesResponse;

import java.util.List;

public interface VRScenesService {

    List<VRScenesPo> getAll();

    VrScenesResponse getPageDataByRequest(VrPageDataRequest vrPageDataRequest);
}
