package com.dute.officialNetwork.api.response.main;

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
    private List<DrawLotteryRaffle> prizeList;

    @ApiModelProperty("装修风格列表")
    private List<ProductCaseType> decorationStyleList;

    @ApiModelProperty("业主案例列表")
    private List<ProductCase> decorationCaseLsit;

    @ApiModelProperty("VR列表")
    private List<VRScenes> vrList;

    @ApiModelProperty("设计师列表")
    private List<DesignerInformation> designerInformationList;

    @ApiModelProperty("走进独特列表")
    private List<CompanyProfilePicture> companyProfilePictureList;

    @ApiModelProperty("企业新闻列表，准备阶段")
    private List<DecorationClass> decorationClassForReadyList;

    @ApiModelProperty("企业新闻列表，施工阶段")
    private List<DecorationClass> decorationClassForOnstructionList;

    @ApiModelProperty("企业新闻列表，首尾入住")
    private List<DecorationClass> decorationClassForWinfUpList;

    public String getPreviews() {
        return previews;
    }

    public void setPreviews(String previews) {
        this.previews = previews;
    }

    public List<DrawLotteryRaffle> getPrizeList() {
        return prizeList;
    }

    public void setPrizeList(List<DrawLotteryRaffle> prizeList) {
        this.prizeList = prizeList;
    }

    public List<ProductCaseType> getDecorationStyleList() {
        return decorationStyleList;
    }

    public void setDecorationStyleList(List<ProductCaseType> decorationStyleList) {
        this.decorationStyleList = decorationStyleList;
    }

    public List<ProductCase> getDecorationCaseLsit() {
        return decorationCaseLsit;
    }

    public void setDecorationCaseLsit(List<ProductCase> decorationCaseLsit) {
        this.decorationCaseLsit = decorationCaseLsit;
    }

    public List<VRScenes> getVrList() {
        return vrList;
    }

    public void setVrList(List<VRScenes> vrList) {
        this.vrList = vrList;
    }

    public List<DesignerInformation> getDesignerInformationList() {
        return designerInformationList;
    }

    public void setDesignerInformationList(List<DesignerInformation> designerInformationList) {
        this.designerInformationList = designerInformationList;
    }

    public List<CompanyProfilePicture> getCompanyProfilePictureList() {
        return companyProfilePictureList;
    }

    public void setCompanyProfilePictureList(List<CompanyProfilePicture> companyProfilePictureList) {
        this.companyProfilePictureList = companyProfilePictureList;
    }

    public List<DecorationClass> getDecorationClassForReadyList() {
        return decorationClassForReadyList;
    }

    public void setDecorationClassForReadyList(List<DecorationClass> decorationClassForReadyList) {
        this.decorationClassForReadyList = decorationClassForReadyList;
    }

    public List<DecorationClass> getDecorationClassForOnstructionList() {
        return decorationClassForOnstructionList;
    }

    public void setDecorationClassForOnstructionList(List<DecorationClass> decorationClassForOnstructionList) {
        this.decorationClassForOnstructionList = decorationClassForOnstructionList;
    }

    public List<DecorationClass> getDecorationClassForWinfUpList() {
        return decorationClassForWinfUpList;
    }

    public void setDecorationClassForWinfUpList(List<DecorationClass> decorationClassForWinfUpList) {
        this.decorationClassForWinfUpList = decorationClassForWinfUpList;
    }
}
