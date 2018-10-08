package com.dute.officialNetwork.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApiModel
public class ResultData<T> {

    private T data;

    private boolean status;

    private String message;

    @SuppressWarnings("unused")
	private static Logger log = LoggerFactory.getLogger(ResultData.class);

    public ResultData(T data) {
        this.status = CODE_SUCCESS;
        this.message = "成功";
        this.data = data;
    }

    public ResultData() {
        this.status = CODE_SUCCESS;
        this.message = "成功";
    }

    public ResultData(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    @ApiModelProperty("业务数据")
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @ApiModelProperty(value = "状态码: true-请求成功 false-业务处理错误")
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @ApiModelProperty("状态描述")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static final boolean  CODE_SUCCESS = true,CODE_FAIL_BIZ = false;

    public boolean success() {
        return this.status == CODE_SUCCESS;
    }

//    @Override
//    public String toString() {
//        return JSONObject.toJSONString(this);
//    }
}