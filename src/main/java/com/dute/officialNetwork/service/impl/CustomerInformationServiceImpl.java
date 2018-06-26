package com.dute.officialNetwork.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.CustomerInformation;
import com.dute.officialNetwork.domain.repository.CustomerInformationRepository;
import com.dute.officialNetwork.service.interfaces.CustomerInformationService;
import com.dute.officialNetwork.util.IPUtil;

import java.util.Date;

@Service
public class CustomerInformationServiceImpl implements CustomerInformationService {

	@Autowired
	private CustomerInformationRepository cir;

	@Override
	public long save(CustomerInformation ci, HttpServletRequest request) {
        ci.setIP(IPUtil.getIpAddr(request));
        ci.setCreateTime(new Date());
        CustomerInformation saveData = cir.save(ci);
        if(saveData == null){
            throw new RuntimeException("申请失败");
        }
        return saveData.getId();
    }

}
