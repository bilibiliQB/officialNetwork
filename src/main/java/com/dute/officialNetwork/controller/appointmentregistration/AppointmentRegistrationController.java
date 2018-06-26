package com.dute.officialNetwork.controller.appointmentregistration;

import com.dute.officialNetwork.api.response.index.appointmentregistration.AppointmentRedistrationResponse;
import com.dute.officialNetwork.util.ResultData;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/6/26.
 */
@Api(description = "预约报名相关控制器")
@RequestMapping("appointment/registration")
@RestController
public class AppointmentRegistrationController {

    @RequestMapping("getMainNavData")
    @ApiOperation("获取首页预约相关数据")
    public ResultData<AppointmentRedistrationResponse> getMainNavData(){
        ResultData<AppointmentRedistrationResponse> resultData = new ResultData<>();
        //TODO 暂时写死，后期有需求使用数据库计算
        AppointmentRedistrationResponse appointmentRedistrationResponse = new AppointmentRedistrationResponse();
        appointmentRedistrationResponse.setQuotedPriceNumber(87);
        appointmentRedistrationResponse.setDesignNumber(1989);
        List<String> list = Lists.newArrayList();
        String str_1 = "20分钟前张女生申请了免费设计";
        String str_2 = "35分钟前刘女生申请了免费设计";
        String str_3 = "50分钟前张先生申请了免费设计";
        String str_4 = "20分钟前李先生申请了免费设计";
        String str_5 = "30分钟前网女士申请了免费设计";
        list.add(str_1);
        list.add(str_2);
        list.add(str_3);
        list.add(str_4);
        list.add(str_5);
        appointmentRedistrationResponse.setList(list);
        resultData.setData(appointmentRedistrationResponse);
        return resultData;
    }
}
