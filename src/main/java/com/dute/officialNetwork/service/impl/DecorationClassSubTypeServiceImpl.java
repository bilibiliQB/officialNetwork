package com.dute.officialNetwork.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.repository.DecorationClassSubTypeRepository;
import com.dute.officialNetwork.service.interfaces.DecorationClassSubTypeService;

@Service
public class DecorationClassSubTypeServiceImpl implements DecorationClassSubTypeService {

	@Autowired
	private DecorationClassSubTypeRepository dcstr;
}
