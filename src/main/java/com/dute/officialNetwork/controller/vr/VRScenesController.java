package com.dute.officialNetwork.controller.vr;

import com.dute.officialNetwork.api.request.vr.VrPageDataRequest;
import com.dute.officialNetwork.api.response.vr.VrScenesResponse;
import com.dute.officialNetwork.service.impl.VRScenesServiceImpl;
import com.dute.officialNetwork.util.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "VR控制器相关")
@RestController
@RequestMapping("vr/contro")
public class VRScenesController {
    @Autowired
    private VRScenesServiceImpl vrScenesService;

    @ApiOperation("获取vr导航页数据，分页返回")
    @PostMapping("getVrPageData")
    public ResultData<VrScenesResponse> getVrPageData(VrPageDataRequest vrPageDataRequest){
        ResultData<VrScenesResponse> resultData = new ResultData<>();
        try {
            resultData.setData(vrScenesService.getPageDataByRequest(vrPageDataRequest));
        }catch (Exception e){
            resultData.setStatus(ResultData.CODE_FAIL_BIZ);
            resultData.setMessage(e.getMessage());
        }
        return resultData;
    }
}
