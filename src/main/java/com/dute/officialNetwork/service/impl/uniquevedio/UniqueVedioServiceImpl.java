package com.dute.officialNetwork.service.impl.uniquevedio;

import com.dute.officialNetwork.api.po.UniqueVedioPo;
import com.dute.officialNetwork.domain.entity.UniqueVedio;
import com.dute.officialNetwork.domain.repository.uniquevedio.UniqueVedioRepository;
import com.dute.officialNetwork.service.interfaces.uniquevedio.IUniqueVedioService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UniqueVedioServiceImpl implements IUniqueVedioService {
    @Autowired
    private UniqueVedioRepository uniqueVedioRepository;


    @Override
    public List<UniqueVedioPo> findAll() {
        List<UniqueVedioPo> list = new ArrayList<>();
        for(UniqueVedio uniqueVedio : uniqueVedioRepository.findAll(new Sort(Sort.Direction.ASC,"uniqueVedioOrder"))){
            UniqueVedioPo uniqueVedioPo = new UniqueVedioPo();
            BeanUtils.copyProperties(uniqueVedio,uniqueVedioPo);
            list.add(uniqueVedioPo);
        }
        return list;
    }
}
