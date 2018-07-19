package com.dute.officialNetwork.controller.building;

import com.dute.officialNetwork.api.request.building.BuildingPageRequest;
import com.dute.officialNetwork.api.response.building.BuildingDataResponse;
import com.dute.officialNetwork.service.interfaces.building.IBuildingService;
import com.dute.officialNetwork.util.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "热装楼盘相关控制器")
@RestController
@RequestMapping("building/data")
public class BuildingController {
    @Autowired
    private IBuildingService buildingService;

    @RequestMapping("/getBuildingData")
    @ApiOperation("获取热装楼盘数据")
    public ResultData<BuildingDataResponse> getBuildingData(BuildingPageRequest buildingPageRequest){
        ResultData<BuildingDataResponse> resultData = new ResultData();
        try {
            resultData.setData(buildingService.getBuildingData(buildingPageRequest));
        }catch (Exception e){
            resultData.setStatus(ResultData.CODE_FAIL_BIZ);
            resultData.setMessage(e.getMessage());
        }
        return resultData;
    }
}
