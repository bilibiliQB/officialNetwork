package com.dute.officialNetwork.service.interfaces;

import java.util.List;

import com.dute.officialNetwork.domain.entity.DecorationClass;

public interface DecorationClassService {
	List<DecorationClass> getDecorationClassByMainTypeId(Integer id);
}
