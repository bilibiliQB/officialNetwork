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
	public Page<OwnerStory> findAll(Pageable pageable) {
		return osr.findAll(pageable);
	}

	@Override
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
}
