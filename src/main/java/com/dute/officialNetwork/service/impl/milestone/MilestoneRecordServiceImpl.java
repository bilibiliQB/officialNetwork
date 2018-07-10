package com.dute.officialNetwork.service.impl.milestone;

import com.dute.officialNetwork.api.po.MilestoneRecordPo;
import com.dute.officialNetwork.domain.entity.MilestoneRecord;
import com.dute.officialNetwork.domain.repository.milestone.MilestoneRecordRepository;
import com.dute.officialNetwork.service.interfaces.milestone.IMilestoneRecordService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MilestoneRecordServiceImpl implements IMilestoneRecordService {
    @Autowired
    private MilestoneRecordRepository milestoneRecordRepository;

    @Override
    public List<MilestoneRecordPo> findAll() {
        List<MilestoneRecordPo> list = new ArrayList<>();
        for(MilestoneRecord milestoneRecord : milestoneRecordRepository.findAll(new Sort(Sort.Direction.ASC,"milestoneTime"))){
            MilestoneRecordPo milestoneRecordPo = new MilestoneRecordPo();
            BeanUtils.copyProperties(milestoneRecord,milestoneRecordPo);
            list.add(milestoneRecordPo);
        }
        return list;
    }
}
