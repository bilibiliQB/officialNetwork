package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.OwnerStory;
import com.dute.officialNetwork.domain.repository.OwnerStoryRepository;
import com.dute.officialNetwork.service.interfaces.OwnerStoryService;

@Service
public class OwnerStoryServiceImpl implements OwnerStoryService {

	@Autowired
	private OwnerStoryRepository osr;

	@Override
//	@Cacheable("ListOwnerStoryAll#12h")
	public Page<OwnerStory> findAll(Pageable pageable) {
		return osr.findAll(pageable);
	}

	@Override
//	@Cacheable("ListOwnerStoryByKeywordsLike#12h")
	public Page<OwnerStory> findAllByKeywordsLike(String keywords, Pageable pageable) {
		StringBuffer str = new StringBuffer();
		str.append("%");
		str.append(keywords);
		str.append("%");
		return osr.findAllByKeywordsLike(str.toString(), pageable);
	}

	@Override
	public OwnerStory getOneById(Long id) {
		OwnerStory os = osr.getOne(id);
		os.getViewingCount();
		return os;
	}

	@Override
	public OwnerStory updateOne(OwnerStory os) {
		return osr.save(os);
	}

	@Override
	public OwnerStory findNextByOrder(Integer order) {
		return osr.findByOsOrder(order + 1) == null ? osr.getOne(1L) : osr.findByOsOrder(order + 1);
	}

	@Override
	public OwnerStory findPrveByOrder(Integer order) {
		return order - 1 == 0 ? osr.getOne(1L) : osr.findPrveByOsOrder(order - 1);
	}
}
