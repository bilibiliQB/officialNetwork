package com.dute.officialNetwork.service.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dute.officialNetwork.domain.entity.CorporateNews;

public interface CorporateNewsService {
	Page<CorporateNews> findAllCreateTimeDesc(Pageable pageable);

	CorporateNews getOneById(Integer id);

	CorporateNews updateOne(CorporateNews cn);

	CorporateNews nextCorporateNews(Integer id);

	CorporateNews prvieCorporateNews(Integer id);
}
