package com.dute.officialNetwork.service.interfaces;

import javax.servlet.http.HttpServletRequest;

import com.dute.officialNetwork.domain.entity.CustomerInformation;

public interface CustomerInformationService {
	long save(CustomerInformation ci, HttpServletRequest request);

}
