package com.dute.officialNetwork.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.CustomerInformation;
import com.dute.officialNetwork.domain.repository.CustomerInformationRepository;
import com.dute.officialNetwork.service.interfaces.CustomerInformationService;
import com.dute.officialNetwork.util.IPUtil;

@Service
public class CustomerInformationServiceImpl implements CustomerInformationService {

	@Autowired
	private CustomerInformationRepository cir;

	@Override
	public Long save(CustomerInformation ci, HttpServletRequest request) {
		if (ci != null) {
			ci.setIP(IPUtil.getIpAddr(request));
			if (cir.save(ci) != null) {
				return cir.save(ci).getId();
			}
		}
		return null;
	}

}
