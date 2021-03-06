package com.dute.officialNetwork.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.GlobalPicPath;
import com.dute.officialNetwork.domain.repository.GlobalPicPathRepository;
import com.dute.officialNetwork.service.interfaces.GlobalPicPathService;

@Service
public class GlobalPicPathServiceImpl implements GlobalPicPathService {

	@Autowired
	private GlobalPicPathRepository gppr;

	@Override
	@Cacheable("ListGlobalPicPathAll#12h")
	public List<GlobalPicPath> getAllByGroupName(String groupName) {
		return gppr.findAllByGlobalPicGroup_Name(groupName);
	}

}
