package com.dute.officialNetwork.service;

import java.util.List;

import com.dute.officialNetwork.domain.entity.DecorationClass;

public interface DecorationClassService {
	List<DecorationClass> getDecorationClassByMainTypeId(Integer id);
}
