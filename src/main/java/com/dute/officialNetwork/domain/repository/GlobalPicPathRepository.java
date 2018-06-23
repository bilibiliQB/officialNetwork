package com.dute.officialNetwork.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dute.officialNetwork.domain.entity.GlobalPicPath;

public interface GlobalPicPathRepository extends JpaRepository<GlobalPicPath, Long> {
	List<GlobalPicPath> findAllByGlobalPicGroup_Name(String groupName);
}
