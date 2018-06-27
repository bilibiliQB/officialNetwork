package com.dute.officialNetwork.service.interfaces;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dute.officialNetwork.domain.entity.DecorationClass;

public interface DecorationClassService {
	List<DecorationClass> getDecorationClassByMainTypeId(Integer id);

	Page<DecorationClass> findByDecorationClassSubType_Id(Integer dcs_id, Pageable pageable);

	Page<DecorationClass> findByKeywordsLike(String keywords, Pageable pageable);

	DecorationClass getOneById(Long id);
}
