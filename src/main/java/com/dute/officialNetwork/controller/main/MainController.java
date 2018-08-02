package com.dute.officialNetwork.controller.main;


import com.dute.officialNetwork.api.response.main.MainDataListResponse;
import com.dute.officialNetwork.service.impl.main.MainServiceImpl;
import com.dute.officialNetwork.util.ResultData;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "首页相关数据")
@RestController
@RequestMapping("main")
public class MainController {

    @Autowired
    private MainServiceImpl mainService;

    @PostMapping(value = "mainData")
    @ResponseBody
    public ResultData<MainDataListResponse> getMainData(){
        ResultData<MainDataListResponse> resultData = new ResultData<MainDataListResponse>();
        try {
            MainDataListResponse mainDataListResponse = mainService.getMainData();
            resultData.setData(mainDataListResponse);
        }catch (Exception e){
            resultData.setStatus(ResultData.CODE_FAIL_BIZ);
            resultData.setMessage("系统开小差了~");
        }
        return resultData;
    }


}
