package com.dute.officialNetwork.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dute.officialNetwork.domain.entity.DecorationClassSubType;

public interface DecorationClassSubTypeRepository extends JpaRepository<DecorationClassSubType, Integer> {
	List<DecorationClassSubType> findByDecorationClassMainType_IdOrderByCreateTime(Integer dcm_id);
}
