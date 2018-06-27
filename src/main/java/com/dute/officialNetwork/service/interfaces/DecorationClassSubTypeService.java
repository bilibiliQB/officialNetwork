package com.dute.officialNetwork.service.interfaces;

import java.util.List;

import com.dute.officialNetwork.domain.entity.DecorationClassSubType;

public interface DecorationClassSubTypeService {
	List<DecorationClassSubType> findByDecorationClassMainType_Id(Integer dcm_id);
}
