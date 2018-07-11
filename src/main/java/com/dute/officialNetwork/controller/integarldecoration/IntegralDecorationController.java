package com.dute.officialNetwork.controller.integarldecoration;


import com.dute.officialNetwork.api.response.integraldecoration.IntegralDecorationResponse;
import com.dute.officialNetwork.service.impl.integraldecoration.IntegralDecorationServiceImpl;
import com.dute.officialNetwork.util.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "独特整装相关控制器")
@RestController
@RequestMapping("integral/decoration")
public class IntegralDecorationController {

    @Autowired
    private IntegralDecorationServiceImpl integralDecorationService;


    @ApiOperation("整装列表")
    @PostMapping("data")
    public ResultData<IntegralDecorationResponse> getIntegralDecorationData(){
        ResultData<IntegralDecorationResponse> resultData = new ResultData<>();
        try {
            IntegralDecorationResponse integralDecorationResponse = new IntegralDecorationResponse();
            integralDecorationResponse.setList(integralDecorationService.findAll());
            resultData.setData(integralDecorationResponse);
        }catch (Exception e){
            resultData.setStatus(ResultData.CODE_FAIL_BIZ);
            resultData.setMessage(e.getMessage());
        }
        return resultData;
    }
}
