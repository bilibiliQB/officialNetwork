package com.dute.officialNetwork.service.interfaces;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dute.officialNetwork.domain.entity.CustomerInformation;

public interface CustomerInformationService {
	long save(CustomerInformation ci, HttpServletRequest request);

	/**
	 * @param problemDescriptionLike
	 *            问题描述模糊查询
	 * @param startTime
	 *            开始时间段[格式 yyyy-MM-dd HH:mm:ss]
	 * @param endTime
	 *            结束时间段[格式 yyyy-MM-dd HH:mm:ss]
	 * @param pageable
	 *            分页字段
	 * @return
	 * @throws Exception
	 */
	Page<CustomerInformation> findAll(String problemDescriptionLike, String startTime, String endTime,
			Pageable pageable) throws Exception;
}
