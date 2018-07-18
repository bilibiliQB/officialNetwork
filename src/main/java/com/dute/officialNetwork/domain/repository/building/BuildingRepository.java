package com.dute.officialNetwork.domain.repository.building;

import com.dute.officialNetwork.domain.entity.BuildingTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<BuildingTable,Integer> {
}
