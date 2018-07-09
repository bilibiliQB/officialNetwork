package com.dute.officialNetwork.service.impl.main;

import com.dute.officialNetwork.api.response.main.MainDataListResponse;
import com.dute.officialNetwork.domain.entity.*;
import com.dute.officialNetwork.service.impl.VRScenesServiceImpl;
import com.dute.officialNetwork.service.interfaces.DecorationClassService;
import com.dute.officialNetwork.service.interfaces.DesignerInformationService;
import com.dute.officialNetwork.service.interfaces.ProductCaseService;
import com.dute.officialNetwork.service.interfaces.ProductCaseTypeService;
import com.dute.officialNetwork.service.interfaces.main.IMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/7/7.
 */
@Service
public class MainServiceImpl implements IMainService {

    @Autowired
    private DrawLotteryRaffleServiceImpl drawLotteryRaffleService;

    @Autowired
    private UngroupedPictureServiceImpl ungroupedPictureService;

    @Autowired
    private ProductCaseTypeService productCaseTypeService;

    @Autowired
	private ProductCaseService productCaseService;

    @Autowired
    private VRScenesServiceImpl vrScenesService;

    @Autowired
    private DesignerInformationService designerInformationService;

    @Autowired
    private CompanyProfilePictureServiceImpl companyProfilePictureService;

    @Autowired
	private DecorationClassService decorationClassService;

    /**
     * 获取主页数据
     * @return MainDataListResponse
     */
    @Override
    public MainDataListResponse getMainData() {
        //1.获取抽奖活动照片 此处设定抽奖活动的图片你编号就是1   一条
        UngroupedPicture ungroupedPicture = ungroupedPictureService.findById(1);
        //2.获取奖品图片列表，并带名称   7条
        List<DrawLotteryRaffle> drawLotteryRaffleList = drawLotteryRaffleService.findAll();
        //3.获取装修风格列表  6条
        List<ProductCaseType> productCaseTypeList = productCaseTypeService.getAll();
        //4.获取业主案例列表 6条
        List<ProductCase> productCaseslist = productCaseService.get6ProductCases();
        //5.VR列表 三条
        List<VRScenes> vrScenesList = vrScenesService.getAll();
        //6.设计师列表
        List<DesignerInformation> designerInformationList = designerInformationService.get5DesignerInformations();
        //7.走进独特列表
        List<CompanyProfilePicture> companyProfilePictureList = companyProfilePictureService.findAll();
        //8.准备
        List<DecorationClass> decorationClassList_1 = decorationClassService.getDecorationClassByMainTypeId(1); //装修课堂 1 准备阶段  6 条
        //9.施工
		List<DecorationClass> decorationClassList_2 = decorationClassService.getDecorationClassByMainTypeId(2); //装修课堂 2 施工阶段  6 条
        //10.收尾
		List<DecorationClass> decorationClassList_3 = decorationClassService.getDecorationClassByMainTypeId(3); //装修课堂 3 收尾阶段  6 条

        //装数据
        MainDataListResponse mainDataListResponse = new MainDataListResponse();
        mainDataListResponse.setCompanyProfilePictureList(companyProfilePictureList);
        mainDataListResponse.setDecorationClassForReadyList(decorationClassList_1);
        mainDataListResponse.setDecorationCaseLsit(productCaseslist);
        mainDataListResponse.setDecorationClassForOnstructionList(decorationClassList_2);
        mainDataListResponse.setDecorationClassForWinfUpList(decorationClassList_3);
        mainDataListResponse.setDesignerInformationList(designerInformationList);
        mainDataListResponse.setPreviews(ungroupedPicture.getUpImgUrl());
        mainDataListResponse.setPrizeList(drawLotteryRaffleList);
        mainDataListResponse.setVrList(vrScenesList);
        mainDataListResponse.setDecorationStyleList(productCaseTypeList);
        return mainDataListResponse;
    }
}
