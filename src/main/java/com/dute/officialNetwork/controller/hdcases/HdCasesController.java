package com.dute.officialNetwork.controller.hdcases;

import com.dute.officialNetwork.api.request.hdcases.HdCasesRequest;
import com.dute.officialNetwork.api.response.hdcases.HdCasesResponse;
import com.dute.officialNetwork.api.response.hdcases.HdSelectListResponse;
import com.dute.officialNetwork.service.interfaces.hdcases.IHdCasesService;
import com.dute.officialNetwork.util.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "高清案例相关控制器")
@RestController
@RequestMapping("hd/cases")
public class HdCasesController {

    @Autowired
    private IHdCasesService hdCasesService;

    @ApiOperation("高清案例列表")
    @PostMapping("data")
    public ResultData<HdCasesResponse> getHdDataByRequest(HdCasesRequest hdCasesRequest){
        ResultData<HdCasesResponse> responseResultData = new ResultData<>();
        try {
            HdCasesResponse hdCasesResponse = hdCasesService.findByRequest(hdCasesRequest);
            responseResultData.setData(hdCasesResponse);
        }catch (Exception e){
            responseResultData.setStatus(ResultData.CODE_FAIL_BIZ);
            responseResultData.setMessage(e.getMessage());
        }
        return responseResultData;
    }

    @ApiOperation("高清案例搜索条件列表")
    @PostMapping("selectData")
    public ResultData<HdSelectListResponse> selectData(){
        ResultData<HdSelectListResponse> responseResultData = new ResultData<>();
        try {
            HdSelectListResponse hdSelectListResponse = hdCasesService.findSelectData();
            responseResultData.setData(hdSelectListResponse);
        }catch (Exception e){
            responseResultData.setStatus(ResultData.CODE_FAIL_BIZ);
            responseResultData.setMessage(e.getMessage());
        }
        return responseResultData;
    }
}
