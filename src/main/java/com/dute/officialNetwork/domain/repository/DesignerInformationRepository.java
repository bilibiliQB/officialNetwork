package com.dute.officialNetwork.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dute.officialNetwork.domain.entity.DesignerInformation;

public interface DesignerInformationRepository extends JpaRepository<DesignerInformation, Integer> {
	List<DesignerInformation> findTop6ByOrderByCreateTimeDesc();
}
