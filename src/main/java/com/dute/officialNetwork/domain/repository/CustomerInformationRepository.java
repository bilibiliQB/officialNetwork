package com.dute.officialNetwork.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dute.officialNetwork.domain.entity.CustomerInformation;

public interface CustomerInformationRepository extends JpaRepository<CustomerInformation, Long> {

}
