package com.dute.officialNetwork.domain.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dute.officialNetwork.domain.entity.DecorationClass;

public interface DecorationClassRepository extends JpaRepository<DecorationClass, Long> {

	@Query(value = "SELECT decoration_class.* FROM decoration_class LEFT JOIN decoration_class_sub_type ON dcs_id = dc_dcs_id LEFT JOIN decoration_class_main_type ON dcm_id = dcs_dcm_id WHERE dcm_id = ?1 ORDER BY dc_create_time DESC LIMIT 0,7;", nativeQuery = true)
	List<DecorationClass> findByMainTypeIdOrderByCreateTime(Integer id);

	Page<DecorationClass> findByDecorationClassSubType_IdOrderByViewingCount(Integer dcs_id, Pageable pageable);

	Page<DecorationClass> findByMainTitleLike(String keywords, Pageable pageable);
}
