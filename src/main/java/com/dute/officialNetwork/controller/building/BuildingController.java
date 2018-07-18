package com.dute.officialNetwork.controller.building;

import com.dute.officialNetwork.service.interfaces.building.IBuildingService;
import com.dute.officialNetwork.util.ResultData;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "热装楼盘相关控制器")
@RestController
@RequestMapping("building/data")
public class BuildingController {
    @Autowired
    private IBuildingService buildingService;

//    public ResultData<> getBuildingData(){
//        ResultData<> resultData = new ResultData();
//        try {
//
//        }catch (Exception e){
//            resultData.setStatus(ResultData.CODE_FAIL_BIZ);
//            resultData.setMessage(e.getMessage());
//        }
//        return resultData;
//    }
}
