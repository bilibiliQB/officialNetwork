package com.dute.officialNetwork.domain.repository.houserevocation;

import com.dute.officialNetwork.domain.entity.HouseRenovationPicTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HouseRenovationRepository extends JpaRepository<HouseRenovationPicTableEntity,Integer> {
    List<HouseRenovationPicTableEntity> findAllByHouseRenovationPicType(int houseRenovationPicType);

    HouseRenovationPicTableEntity findByHouseRenovationPicType(int houseRenovationPicType);
}
