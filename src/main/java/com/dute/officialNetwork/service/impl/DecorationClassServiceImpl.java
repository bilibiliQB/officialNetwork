package com.dute.officialNetwork.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.dute.officialNetwork.api.po.CompanyProfilePicturePo;
import com.dute.officialNetwork.api.po.DecorationClassPo;
import com.dute.officialNetwork.domain.entity.CompanyProfilePicture;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.domain.entity.DecorationClass;
import com.dute.officialNetwork.domain.repository.DecorationClassRepository;
import com.dute.officialNetwork.service.interfaces.DecorationClassService;

@Service
public class DecorationClassServiceImpl implements DecorationClassService {

	@Autowired
	private DecorationClassRepository dcr;

	@Override
//	@Cacheable("ListDecorationClassByMainTypeId#30m")
	public List<DecorationClassPo> getDecorationClassByMainTypeId(Integer id) {
		List<DecorationClassPo> list = new ArrayList<>();
		for(DecorationClass decorationClass : dcr.findByMainTypeIdOrderByCreateTime(id)){
			DecorationClassPo decorationClassPo = new DecorationClassPo();
			BeanUtils.copyProperties(decorationClass,decorationClassPo);
			list.add(decorationClassPo);
		}
		return list;
	}

	@Override
	@Cacheable("ListDecorationClassBySubTypeId#30m")
	public Page<DecorationClass> findByDecorationClassSubType_Id(Integer dcs_id, Pageable pageable) {
		return dcr.findByDecorationClassSubType_IdOrderByViewingCount(dcs_id, pageable);
	}

	@Override
	@Cacheable("ListDecorationClassByKeywordsLike#30m")
	public Page<DecorationClass> findByKeywordsLike(String keywords, Pageable pageable) {
		StringBuffer str = new StringBuffer();
		str.append("%");
		str.append(keywords);
		str.append("%");
		return dcr.findByKeywordsLike(str.toString(), pageable);
	}

	@Override
	public DecorationClass getOneById(Long id) {
		DecorationClass dc = dcr.getOne(id);
		dc.getViewingCount();
		return dc;
	}

	@Override
	public DecorationClass updateOne(DecorationClass dc) {
		return dcr.save(dc);
	}
}
