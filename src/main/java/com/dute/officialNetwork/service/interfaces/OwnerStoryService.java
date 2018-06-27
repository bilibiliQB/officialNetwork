package com.dute.officialNetwork.service.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dute.officialNetwork.domain.entity.OwnerStory;

public interface OwnerStoryService {
	Page<OwnerStory> findAll(Pageable pageable);

	Page<OwnerStory> findAllByKeywordsLike(String keywords, Pageable pageable);
}
