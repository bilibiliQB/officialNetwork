package com.dute.officialNetwork.service.impl.houserenovaton;

import com.dute.officialNetwork.api.response.houserenovation.HouseMainDataResponse;
import com.dute.officialNetwork.api.response.houserenovation.HouseRenovationPicTableResponse;
import com.dute.officialNetwork.domain.entity.HouseRenovationPicTableEntity;
import com.dute.officialNetwork.domain.repository.houserevocation.HouseRenovationRepository;
import com.dute.officialNetwork.service.interfaces.houserenovation.HouseRenovationService;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseRenovationServiceImpl implements HouseRenovationService {
    @Autowired
    private HouseRenovationRepository houseRenovationRepository;

    @Override
    public HouseMainDataResponse getMainData() {
        //定义变量
        HouseMainDataResponse houseMainDataResponse = new HouseMainDataResponse();
        List<HouseRenovationPicTableResponse> optimizationSystemList = Lists.newArrayList();
        List<HouseRenovationPicTableResponse> transformTwoList = Lists.newArrayList();
        HouseRenovationPicTableResponse serviceProcess = new HouseRenovationPicTableResponse();


        //获取首页优化体系图片列表
        List<HouseRenovationPicTableEntity> optimizationSystemListPO = houseRenovationRepository.findAllByHouseRenovationPicType(1);
        for(HouseRenovationPicTableEntity houseRenovationPicTableEntity : optimizationSystemListPO){
            HouseRenovationPicTableResponse houseRenovationPicTableResponse = new HouseRenovationPicTableResponse();
            BeanUtils.copyProperties(houseRenovationPicTableEntity,houseRenovationPicTableResponse);
            optimizationSystemList.add(houseRenovationPicTableResponse);
        }

        //获取首页改造2.0列表
        List<HouseRenovationPicTableEntity> transformTwoListPO = houseRenovationRepository.findAllByHouseRenovationPicType(2);
        for(HouseRenovationPicTableEntity houseRenovationPicTableEntity : transformTwoListPO){
            HouseRenovationPicTableResponse houseRenovationPicTableResponse = new HouseRenovationPicTableResponse();
            BeanUtils.copyProperties(houseRenovationPicTableEntity,houseRenovationPicTableResponse);
            transformTwoList.add(houseRenovationPicTableResponse);
        }

        //获取首页服务流程图片
        HouseRenovationPicTableEntity serviceProcessPO = houseRenovationRepository.findByHouseRenovationPicType(3);
        BeanUtils.copyProperties(serviceProcessPO,serviceProcess);

        houseMainDataResponse.setOptimizationSystemList(optimizationSystemList);
        houseMainDataResponse.setTransformTwoList(transformTwoList);
        houseMainDataResponse.setServiceProcess(serviceProcess);
        return houseMainDataResponse;
    }
}
