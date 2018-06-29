package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.GlobalPicGroupRepository;
import com.dute.officialNetwork.service.interfaces.GlobalPicGroupService;

@Service
public class GlobalPicGroupServiceImpl implements GlobalPicGroupService {

	@Autowired
	@SuppressWarnings("unused")
	private GlobalPicGroupRepository gpgr;
}
