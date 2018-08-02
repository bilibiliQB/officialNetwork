package com.dute.officialNetwork.api.response.main;

import com.dute.officialNetwork.api.po.*;
import com.dute.officialNetwork.api.response.banner.BannerPicResponse;
import com.dute.officialNetwork.api.response.index.CorporateNewsResponse0;
import com.dute.officialNetwork.api.response.index.DesignerInformationResponse0;
import com.dute.officialNetwork.api.response.index.ProductCaseResponse0;
import com.dute.officialNetwork.api.response.index.ProductCaseTypeResponse0;
import com.dute.officialNetwork.domain.entity.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class MainDataListResponse {
    @ApiModelProperty("预约送家电图片")
    private String previews;

    @ApiModelProperty("奖品列表")
    private List<DrawLotteryRafflePo> prizeList;

    @ApiModelProperty("装修风格列表")
    private List<ProductCaseTypePo> decorationStyleList;

    @ApiModelProperty("业主案例列表")
    private List<ProductCasePo> decorationCaseLsit;

    @ApiModelProperty("VR列表第一个对象")
    private VRScenesPo vrOne;

    @ApiModelProperty("VR列表第二个对象")
    private VRScenesPo vrTwo;

    @ApiModelProperty("VR列表第三个对象")
    private VRScenesPo vrThree;

    @ApiModelProperty("设计师列表")
    private List<DesignerInformationPo> designerInformationList;

    @ApiModelProperty("走进独特列表")
    private List<CompanyProfilePicturePo> companyProfilePictureList;

    @ApiModelProperty("企业新闻列表，准备阶段")
    private List<DecorationClassPo> decorationClassForReadyList;

    @ApiModelProperty("企业新闻列表，施工阶段")
    private List<DecorationClassPo> decorationClassForOnstructionList;

    @ApiModelProperty("企业新闻列表，首尾入住")
    private List<DecorationClassPo> decorationClassForWinfUpList;

    @ApiModelProperty("首页banner图")
    private BannerPicResponse bannerPicResponse;

    public BannerPicResponse getBannerPicResponse() {
        return bannerPicResponse;
    }

    public void setBannerPicResponse(BannerPicResponse bannerPicResponse) {
        this.bannerPicResponse = bannerPicResponse;
    }

    public String getPreviews() {
        return previews;
    }

    public void setPreviews(String previews) {
        this.previews = previews;
    }

    public List<DrawLotteryRafflePo> getPrizeList() {
        return prizeList;
    }

    public void setPrizeList(List<DrawLotteryRafflePo> prizeList) {
        this.prizeList = prizeList;
    }

    public List<ProductCaseTypePo> getDecorationStyleList() {
        return decorationStyleList;
    }

    public void setDecorationStyleList(List<ProductCaseTypePo> decorationStyleList) {
        this.decorationStyleList = decorationStyleList;
    }

    public List<ProductCasePo> getDecorationCaseLsit() {
        return decorationCaseLsit;
    }

    public void setDecorationCaseLsit(List<ProductCasePo> decorationCaseLsit) {
        this.decorationCaseLsit = decorationCaseLsit;
    }

    public VRScenesPo getVrOne() {
        return vrOne;
    }

    public void setVrOne(VRScenesPo vrOne) {
        this.vrOne = vrOne;
    }

    public VRScenesPo getVrTwo() {
        return vrTwo;
    }

    public void setVrTwo(VRScenesPo vrTwo) {
        this.vrTwo = vrTwo;
    }

    public VRScenesPo getVrThree() {
        return vrThree;
    }

    public void setVrThree(VRScenesPo vrThree) {
        this.vrThree = vrThree;
    }

    public List<DesignerInformationPo> getDesignerInformationList() {
        return designerInformationList;
    }

    public void setDesignerInformationList(List<DesignerInformationPo> designerInformationList) {
        this.designerInformationList = designerInformationList;
    }

    public List<CompanyProfilePicturePo> getCompanyProfilePictureList() {
        return companyProfilePictureList;
    }

    public void setCompanyProfilePictureList(List<CompanyProfilePicturePo> companyProfilePictureList) {
        this.companyProfilePictureList = companyProfilePictureList;
    }

    public List<DecorationClassPo> getDecorationClassForReadyList() {
        return decorationClassForReadyList;
    }

    public void setDecorationClassForReadyList(List<DecorationClassPo> decorationClassForReadyList) {
        this.decorationClassForReadyList = decorationClassForReadyList;
    }

    public List<DecorationClassPo> getDecorationClassForOnstructionList() {
        return decorationClassForOnstructionList;
    }

    public void setDecorationClassForOnstructionList(List<DecorationClassPo> decorationClassForOnstructionList) {
        this.decorationClassForOnstructionList = decorationClassForOnstructionList;
    }

    public List<DecorationClassPo> getDecorationClassForWinfUpList() {
        return decorationClassForWinfUpList;
    }

    public void setDecorationClassForWinfUpList(List<DecorationClassPo> decorationClassForWinfUpList) {
        this.decorationClassForWinfUpList = decorationClassForWinfUpList;
    }
}
