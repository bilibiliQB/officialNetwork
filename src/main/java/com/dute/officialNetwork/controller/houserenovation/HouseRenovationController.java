package com.dute.officialNetwork.controller.houserenovation;


import com.dute.officialNetwork.api.response.houserenovation.HouseMainDataResponse;
import com.dute.officialNetwork.service.interfaces.houserenovation.HouseRenovationService;
import com.dute.officialNetwork.util.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "老房改造相关控制器")
@RestController
@RequestMapping("/house/data")
public class HouseRenovationController {
    @Autowired
    private HouseRenovationService houseRenovationService;

    @PostMapping("mainData")
    @ApiOperation("老房改造相关控制器")
    public ResultData<HouseMainDataResponse> mainData(){
        ResultData<HouseMainDataResponse> resultData = new ResultData<>();
        try {
            resultData.setData(houseRenovationService.getMainData());
        }catch (Exception e){
            resultData.setStatus(ResultData.CODE_FAIL_BIZ);
            resultData.setMessage(e.getMessage());
        }
        return resultData;
    }
}
