package com.dute.officialNetwork.service;

import java.util.List;

import com.dute.officialNetwork.domain.entity.GlobalPicPath;

public interface GlobalPicPathService {

	List<GlobalPicPath> getAllByGroupName(String groupName);
}
