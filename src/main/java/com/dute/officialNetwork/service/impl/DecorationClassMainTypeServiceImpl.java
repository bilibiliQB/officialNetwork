package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.DecorationClassMainTypeRepository;
import com.dute.officialNetwork.service.DecorationClassMainTypeService;

@Service
public class DecorationClassMainTypeServiceImpl implements DecorationClassMainTypeService {

	@Autowired
	private DecorationClassMainTypeRepository dcmtr;
}
