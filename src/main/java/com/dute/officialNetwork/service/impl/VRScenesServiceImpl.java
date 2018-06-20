package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.VRScenesRepository;
import com.dute.officialNetwork.service.VRScenesService;

@Service
public class VRScenesServiceImpl implements VRScenesService {

	@Autowired
	private VRScenesRepository VRSr;
}
