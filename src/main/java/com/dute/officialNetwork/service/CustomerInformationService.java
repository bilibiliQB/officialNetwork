package com.dute.officialNetwork.service;

import javax.servlet.http.HttpServletRequest;

import com.dute.officialNetwork.domain.entity.CustomerInformation;

public interface CustomerInformationService {
	Long save(CustomerInformation ci, HttpServletRequest request);

}
