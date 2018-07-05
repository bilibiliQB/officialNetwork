package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.CorporateNews;
import com.dute.officialNetwork.domain.repository.CorporateNewsRepository;
import com.dute.officialNetwork.service.interfaces.CorporateNewsService;

@Service
public class CorporateNewsServiceImpl implements CorporateNewsService {

	@Autowired
	private CorporateNewsRepository cnr;

	@Override
	@Cacheable("CorporateNewsList#12h")
	public Page<CorporateNews> findAllCreateTimeDesc(Pageable pageable) {
		return cnr.findAllByOrderByCreateTimeDesc(pageable);
	}

	@Override
	public CorporateNews getOneById(Integer id) {
		CorporateNews cn = cnr.getOne(id);
		cn.getViewingCount();
		return cn;
	}

	@Override
	public CorporateNews updateOne(CorporateNews cn) {
		return cnr.save(cn);
	}

}
