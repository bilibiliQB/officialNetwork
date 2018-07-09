package com.dute.officialNetwork.service.impl;

import com.dute.officialNetwork.domain.entity.VRScenes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.VRScenesRepository;
import com.dute.officialNetwork.service.interfaces.VRScenesService;

import java.util.List;

@Service
public class VRScenesServiceImpl implements VRScenesService {

	@Autowired
	private VRScenesRepository VRSr;


    @Override
    public List<VRScenes> getAll() {
        return VRSr.findAll();
    }
}
