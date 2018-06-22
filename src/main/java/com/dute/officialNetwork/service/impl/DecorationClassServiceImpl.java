package com.dute.officialNetwork.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.DecorationClass;
import com.dute.officialNetwork.domain.repository.DecorationClassRepository;
import com.dute.officialNetwork.service.DecorationClassService;

@Service
public class DecorationClassServiceImpl implements DecorationClassService {

	@Autowired
	private DecorationClassRepository dcr;

	@Override
	public List<DecorationClass> getDecorationClassByMainTypeId(Long id) {
		return dcr.findByMainTypeIdOrderByCreateTime(id);
	}
}
