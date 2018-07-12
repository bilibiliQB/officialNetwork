package com.dute.officialNetwork.domain.repository.hdcases;

import com.dute.officialNetwork.domain.entity.HdCases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HdCasesRepository extends JpaRepository<HdCases,Integer>,JpaSpecificationExecutor<HdCases> {
}
