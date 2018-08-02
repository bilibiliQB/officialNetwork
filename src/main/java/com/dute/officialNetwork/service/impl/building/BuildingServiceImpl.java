package com.dute.officialNetwork.service.impl.building;

import com.dute.officialNetwork.api.request.building.BuildingPageRequest;
import com.dute.officialNetwork.api.response.building.BuildingDataResponse;
import com.dute.officialNetwork.api.response.building.BuildinglistDataResponse;
import com.dute.officialNetwork.domain.entity.BuildingTable;
import com.dute.officialNetwork.domain.entity.CustomerInformation;
import com.dute.officialNetwork.domain.entity.SubscribeBuildingFitment;
import com.dute.officialNetwork.domain.repository.CustomerInformationRepository;
import com.dute.officialNetwork.domain.repository.building.BuildingRepository;
import com.dute.officialNetwork.service.interfaces.building.IBuildingService;
import com.dute.officialNetwork.util.DateUtils;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BuildingServiceImpl implements IBuildingService {
    @Autowired
    private BuildingRepository buildingRepository;

    @Autowired
    private CustomerInformationRepository customerInformationRepository;


    @Override
    public BuildingDataResponse getBuildingData(BuildingPageRequest buildingPageRequest) {
        //获取楼盘列表
        Page<BuildingTable> buildingRepositoryAll = buildingRepository.findAllByBuildingNameLike(new PageRequest(buildingPageRequest.getPageNumber() - 1, 5),"%"+buildingPageRequest.getSelectStr()+"%");
        List<BuildingTable> buildingTableList = buildingRepositoryAll.getContent();
        //创建变量集合
        List<BuildinglistDataResponse> buildinglistDataResponseList = Lists.newArrayList();
        List<String> applicationRecordList = Lists.newArrayList();

        BuildingDataResponse buildingDataResponse = new BuildingDataResponse();

        //判断
        if(buildingTableList != null && buildingTableList.size() > 0){
            //遍历
            buildingTableList.forEach(buildingTable -> {
                int operation = 0 , completed = 0;
                BuildinglistDataResponse buildinglistDataResponse = new BuildinglistDataResponse();
                //设置
                BeanUtils.copyProperties(buildingTable,buildinglistDataResponse);
                List<SubscribeBuildingFitment> subscribeBuildingFitmentList = buildingTable.getSubscribeBuildingFitmentList();
                if(subscribeBuildingFitmentList != null && subscribeBuildingFitmentList.size() > 0){
                    for(SubscribeBuildingFitment subscribeBuildingFitment : subscribeBuildingFitmentList){
                        String subscribeBuildingStatus = subscribeBuildingFitment.getSubscribeBuildingStatus();
                        if("1".equals(subscribeBuildingStatus)){
                            operation++;
                        }else if("2".equals(subscribeBuildingStatus)){
                            completed++;
                        }
                    }
                }
                buildinglistDataResponse.setOperationNumer(operation);
                buildinglistDataResponse.setCompletedNumber(completed);
                buildinglistDataResponse.setAppointmentNumber(subscribeBuildingFitmentList == null ? 0 : subscribeBuildingFitmentList.size());
                buildinglistDataResponseList.add(buildinglistDataResponse);
            });
        }

        //获取预约成功的列表集合(查询预约表数据)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfmat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = null;
        Date parse1 = null;
        try {
            parse = sdfmat.parse(sdfmat.format(sdf.parse(sdf.format(new Date())).getTime()));
            parse1 =  sdfmat.parse(sdfmat.format(sdf.parse(sdf.format(new Date())).getTime() + 86400000));
        } catch (Exception e) {
        }
        List<CustomerInformation> customerInformationList = customerInformationRepository.findAllByProblemDescriptionLikeAndCreateTimeBetween("申请家装团购",parse,parse1,new PageRequest(0,6,new Sort(Sort.Direction.ASC,"createTime"))).getContent();

        if(customerInformationList != null && customerInformationList.size() > 0){
            for(CustomerInformation customerInformation : customerInformationList){
                Date createTime = customerInformation.getCreateTime();
                String startTime = DateUtils.formatDateTime(createTime);
                String endTime = DateUtils.formatDateTime(new Date());
                long towTime12 = DateUtils.getDistanceMinute(endTime,startTime);
                StringBuffer sb = new StringBuffer();
                String phoneNumber = customerInformation.getPhoneNumber();
                String phoneNumber_two = phoneNumber.substring(0,3) + "******" + phoneNumber.substring(9,phoneNumber.length());
                sb.append(customerInformation.getName().substring(0,1)).append("**").append(phoneNumber_two).append(",").append(towTime12).append("分钟前申请成功");
                applicationRecordList.add(sb.toString());
            }
        }

        buildingDataResponse.setBuildinglistDataResponseList(buildinglistDataResponseList);
        buildingDataResponse.setApplicationRecordList(applicationRecordList);
        buildingDataResponse.setTotalNumber(buildingRepositoryAll.getTotalElements());
        return buildingDataResponse;
    }
}
