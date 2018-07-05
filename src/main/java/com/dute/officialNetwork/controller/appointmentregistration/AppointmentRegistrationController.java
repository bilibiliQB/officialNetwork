package com.dute.officialNetwork.controller.appointmentregistration;

import com.dute.officialNetwork.api.response.index.appointmentregistration.AppointmentRedistrationResponse;
import com.dute.officialNetwork.api.vo.DesingRecord;
import com.dute.officialNetwork.util.ResultData;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhanghongwei on 2018/6/26.
 */
@Api(description = "预约报名相关控制器")
@RequestMapping("appointment/registration")
@RestController
public class AppointmentRegistrationController {

    @PostMapping("getMainNavData")
    @ApiOperation("获取首页预约相关数据")
    public ResultData<AppointmentRedistrationResponse> getMainNavData(){
        ResultData<AppointmentRedistrationResponse> resultData = new ResultData<>();
        //TODO 暂时写死，后期有需求使用数据库计算
        AppointmentRedistrationResponse appointmentRedistrationResponse = new AppointmentRedistrationResponse();
        appointmentRedistrationResponse.setQuotedPriceNumber(87);
        appointmentRedistrationResponse.setDesignNumber(1989);
        List<DesingRecord> list = Lists.newArrayList();
        DesingRecord desingRecord1 = new DesingRecord("20分钟前张女生申请了免费设计");
        DesingRecord desingRecord2 = new DesingRecord("20分钟前张女生申请了免费设计");
        DesingRecord desingRecord3 = new DesingRecord("50分钟前张先生申请了免费设计");
        DesingRecord desingRecord4 = new DesingRecord("20分钟前李先生申请了免费设计");
        DesingRecord desingRecord5 = new DesingRecord("30分钟前网女士申请了免费设计");
        list.add(desingRecord1);
        list.add(desingRecord2);
        list.add(desingRecord3);
        list.add(desingRecord4);
        list.add(desingRecord5);
        appointmentRedistrationResponse.setList(list);
        resultData.setData(appointmentRedistrationResponse);
        return resultData;
    }
}
