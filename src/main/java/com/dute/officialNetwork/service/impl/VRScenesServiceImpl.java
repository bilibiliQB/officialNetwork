package com.dute.officialNetwork.service.impl;

import com.dute.officialNetwork.api.po.DrawLotteryRafflePo;
import com.dute.officialNetwork.api.po.VRScenesPo;
import com.dute.officialNetwork.api.request.vr.VrPageDataRequest;
import com.dute.officialNetwork.domain.entity.DrawLotteryRaffle;
import com.dute.officialNetwork.domain.entity.VRScenes;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.VRScenesRepository;
import com.dute.officialNetwork.service.interfaces.VRScenesService;

import java.util.ArrayList;
import java.util.List;

@Service
public class VRScenesServiceImpl implements VRScenesService {

	@Autowired
	private VRScenesRepository VRSr;


    @Override
    public List<VRScenesPo> getAll() {
        List<VRScenesPo> list = new ArrayList<>();
        PageRequest pageable = new PageRequest(0,3,new Sort(Sort.Direction.ASC,"vsOrder"));
        Page<VRScenes> vrSrAll = VRSr.findAll(pageable);
        for(VRScenes vrScenes : vrSrAll.getContent()){
            VRScenesPo vrScenesPo = new VRScenesPo();
            BeanUtils.copyProperties(vrScenes,vrScenesPo);
            list.add(vrScenesPo);
        }
        return list;
    }

    @Override
    public List<VRScenesPo> getPageDataByRequest(VrPageDataRequest vrPageDataRequest) {
        List<VRScenesPo> list = new ArrayList<>();
        PageRequest pageable = new PageRequest(vrPageDataRequest.getPageNumber() -1 ,vrPageDataRequest.getPageSize());
        List<VRScenes> vrSrAll = VRSr.findAll(pageable).getContent();
        for(VRScenes vrScenes : vrSrAll){
            VRScenesPo vrScenesPo = new VRScenesPo();
            BeanUtils.copyProperties(vrScenes,vrScenesPo);
            list.add(vrScenesPo);
        }
        return list;
    }
}
