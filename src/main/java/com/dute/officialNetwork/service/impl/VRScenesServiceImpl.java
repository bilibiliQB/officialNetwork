package com.dute.officialNetwork.service.impl;

import com.dute.officialNetwork.api.po.DrawLotteryRafflePo;
import com.dute.officialNetwork.api.po.VRScenesPo;
import com.dute.officialNetwork.domain.entity.DrawLotteryRaffle;
import com.dute.officialNetwork.domain.entity.VRScenes;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
        for(VRScenes vrScenes : VRSr.findAll()){
            VRScenesPo vrScenesPo = new VRScenesPo();
            BeanUtils.copyProperties(vrScenes,vrScenesPo);
            list.add(vrScenesPo);
        }
        return list;
    }
}
