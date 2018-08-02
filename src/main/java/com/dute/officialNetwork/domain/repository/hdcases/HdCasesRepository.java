package com.dute.officialNetwork.domain.repository.hdcases;

import com.dute.officialNetwork.domain.entity.HdCases;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HdCasesRepository extends JpaRepository<HdCases,Integer>,JpaSpecificationExecutor<HdCases> {
    HdCases findByHdCasesOrder(int i);
}
