package com.dute.officialNetwork.controller.nav;

import com.dute.officialNetwork.api.response.index.nav.DecorationNavResponse;
import com.dute.officialNetwork.service.interfaces.nav.IDecortionNavService;
import com.dute.officialNetwork.util.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/6/25.
 */
@Api(description = "导航栏相关控制器")
@RestController
@RequestMapping("/decoration/nav")
public class DecorationNavController {

    @Autowired
    private IDecortionNavService decortionNavService;

    @PostMapping(value = "list")
    @ApiOperation(value = "当行列表")
    public ResultData<List<DecorationNavResponse>> getDecorationNavList(){
        ResultData<List<DecorationNavResponse>> resultData = new ResultData<>();
        try {
            List<DecorationNavResponse> list = decortionNavService.findAllByTabShow(1);
            resultData.setData(list);
            return resultData;
        } catch (Exception e) {
            resultData.setStatus(ResultData.CODE_FAIL_BIZ);
            resultData.setMessage(e.getMessage());
            return resultData;
        }
    }
}
