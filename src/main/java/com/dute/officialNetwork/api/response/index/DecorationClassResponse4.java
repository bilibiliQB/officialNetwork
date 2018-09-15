package com.dute.officialNetwork.api.response.index;

import com.dute.officialNetwork.api.response.decoration.ResponseDataToDecoration;
import io.swagger.annotations.ApiModelProperty;

// 装修课堂文章详情页
public class DecorationClassResponse4 extends BasisArticleDetails{
    @ApiModelProperty("上一个")
    private ResponseDataToDecoration responseDataToDecorationN;

    @ApiModelProperty("下一个")
    private ResponseDataToDecoration responseDataToDecorationP;

    public ResponseDataToDecoration getResponseDataToDecorationN() {
        return responseDataToDecorationN;
    }

    public void setResponseDataToDecorationN(ResponseDataToDecoration responseDataToDecorationN) {
        this.responseDataToDecorationN = responseDataToDecorationN;
    }

    public ResponseDataToDecoration getResponseDataToDecorationP() {
        return responseDataToDecorationP;
    }

    public void setResponseDataToDecorationP(ResponseDataToDecoration responseDataToDecorationP) {
        this.responseDataToDecorationP = responseDataToDecorationP;
    }
}
