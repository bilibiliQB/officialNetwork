package com.dute.officialNetwork.service.interfaces;

import java.util.List;

import com.dute.officialNetwork.domain.entity.GlobalPicPath;

public interface GlobalPicPathService {

	List<GlobalPicPath> getAllByGroupName(String groupName);
}
