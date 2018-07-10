package com.dute.officialNetwork.service.impl.cooperativepartner;

import com.dute.officialNetwork.api.po.CooperativePartnerPo;
import com.dute.officialNetwork.domain.entity.CooperativePartner;
import com.dute.officialNetwork.domain.repository.cooperativepartner.CooperativePartnerRepository;
import com.dute.officialNetwork.service.interfaces.cooperativepartner.ICooperativePartnerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhanghongwei on 2018/7/10.
 */
@Service
public class CooperativePartnerServiceImpl implements ICooperativePartnerService {

    @Autowired
    private CooperativePartnerRepository cooperativePartnerRepository;

    @Override
    public List<CooperativePartnerPo> findAll() {
        List<CooperativePartnerPo> list = new ArrayList<>();
        for(CooperativePartner cooperativePartner : cooperativePartnerRepository.findAll()){
            CooperativePartnerPo cooperativePartnerPo = new CooperativePartnerPo();
            BeanUtils.copyProperties(cooperativePartner,cooperativePartnerPo);
            list.add(cooperativePartnerPo);
        }
        return list;
    }
}
