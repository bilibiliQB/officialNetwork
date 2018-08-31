package com.dute.officialNetwork.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.CustomerInformation;
import com.dute.officialNetwork.domain.repository.CustomerInformationRepository;
import com.dute.officialNetwork.service.interfaces.CustomerInformationService;
import com.dute.officialNetwork.util.IPUtil;
import com.dute.officialNetwork.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CustomerInformationServiceImpl implements CustomerInformationService {

	@Autowired
	private CustomerInformationRepository cir;

	@Override
	public long save(CustomerInformation ci, HttpServletRequest request) {
		ci.setIP(IPUtil.getIpAddr(request));
		ci.setCreateTime(new Date());
		if (ci.getProblemDescription() == null) {
			ci.setProblemDescription("");
		}
		CustomerInformation saveData = cir.save(ci);
		if (saveData == null) {
			throw new RuntimeException("申请失败");
		}
		return saveData.getId();
	}

	@Override
	public Page<CustomerInformation> findAll(String problemDescriptionLike, String startTime, String endTime,
			Pageable pageable) throws Exception {
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		StringBuffer str = new StringBuffer();
		str.append("%");
		str.append(problemDescriptionLike);
		str.append("%");
		if (StringUtils.isBlank(startTime)) {
			startTime = sdf.format(new Date(0));
		}
		if (StringUtils.isBlank(endTime)) {
			endTime = sdf.format(new Date(System.currentTimeMillis()));
		}
		return cir.findAllByProblemDescriptionLikeAndCreateTimeBetween(str.toString(), sdf.parse(startTime),
				sdf.parse(endTime), pageable);
	}

}
