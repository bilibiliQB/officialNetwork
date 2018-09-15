package com.dute.officialNetwork.domain.repository.building;

import com.dute.officialNetwork.domain.entity.BuildingTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<BuildingTable,Integer> {
    Page<BuildingTable> findAllByBuildingNameLike(Pageable pageRequest, String selectStr);
}

