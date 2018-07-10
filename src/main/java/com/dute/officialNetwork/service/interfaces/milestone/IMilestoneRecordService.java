package com.dute.officialNetwork.service.interfaces.milestone;

import com.dute.officialNetwork.api.po.MilestoneRecordPo;

import java.util.List;

public interface IMilestoneRecordService {
    List<MilestoneRecordPo> findAll();
}
