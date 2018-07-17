package com.dute.officialNetwork.service.interfaces;

import com.dute.officialNetwork.api.po.VRScenesPo;
import com.dute.officialNetwork.api.request.vr.VrPageDataRequest;

import java.util.List;

public interface VRScenesService {

    List<VRScenesPo> getAll();

    List<VRScenesPo> getPageDataByRequest(VrPageDataRequest vrPageDataRequest);
}
