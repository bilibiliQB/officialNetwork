package com.dute.officialNetwork.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dute.officialNetwork.domain.entity.OwnerStory;

public interface OwnerStoryRepository extends JpaRepository<OwnerStory, Long> {
	Page<OwnerStory> findAllByKeywordsLike(String keywords, Pageable pageable);

    OwnerStory findByOsOrder(int i);

    OwnerStory findPrveByOsOrder(int i);
}

