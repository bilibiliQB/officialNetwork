package com.dute.officialNetwork.domain.repository;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dute.officialNetwork.domain.entity.CustomerInformation;

public interface CustomerInformationRepository extends JpaRepository<CustomerInformation, Long> {
	Page<CustomerInformation> findAllByProblemDescriptionLikeAndCreateTimeBetween(String problemDescription,
			Date startTime, Date endTime, Pageable pageable);
}
