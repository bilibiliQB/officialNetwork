package com.dute.officialNetwork.service.impl.main;

import com.dute.officialNetwork.api.po.*;
import com.dute.officialNetwork.api.response.banner.BannerPicResponse;
import com.dute.officialNetwork.api.response.main.MainDataListResponse;
import com.dute.officialNetwork.api.response.main.VRResponse;
import com.dute.officialNetwork.domain.entity.*;
import com.dute.officialNetwork.service.impl.VRScenesServiceImpl;
import com.dute.officialNetwork.service.interfaces.DecorationClassService;
import com.dute.officialNetwork.service.interfaces.DesignerInformationService;
import com.dute.officialNetwork.service.interfaces.ProductCaseService;
import com.dute.officialNetwork.service.interfaces.ProductCaseTypeService;
import com.dute.officialNetwork.service.interfaces.banner.BannerTableServiceImpl;
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

    @Autowired
    private BannerTableServiceImpl bannerTableService;

    /**
     * 获取主页数据
     * @return MainDataListResponse
     */
    @Override
    public MainDataListResponse getMainData() {
        //1.获取抽奖活动照片 此处设定抽奖活动的图片你编号就是1   一条
        UngroupedPicture ungroupedPicture = ungroupedPictureService.findById(1);

        //2.获取奖品图片列表，并带名称   7条
        List<DrawLotteryRafflePo> drawLotteryRaffleList = drawLotteryRaffleService.findAll();
        //3.获取装修风格列表  6条
        List<ProductCaseTypePo> productCaseTypeList = productCaseTypeService.getAll();
        //4.获取业主案例列表 6条
        List<ProductCasePo> productCaseslist = productCaseService.get6ProductCases();
        //5.VR列表 三条
        List<VRScenesPo> vrScenesList = vrScenesService.getAll();

        //6.设计师列表
        List<DesignerInformationPo> designerInformationList = designerInformationService.get5DesignerInformations();
        //7.走进独特列表
        List<CompanyProfilePicturePo> companyProfilePictureList = companyProfilePictureService.findAll();
        //8.准备
        List<DecorationClassPo> decorationClassList_1 = decorationClassService.getDecorationClassByMainTypeId(1); //装修课堂 1 准备阶段  6 条
        //9.施工
		List<DecorationClassPo> decorationClassList_2 = decorationClassService.getDecorationClassByMainTypeId(2); //装修课堂 2 施工阶段  6 条
        //10.收尾
		List<DecorationClassPo> decorationClassList_3 = decorationClassService.getDecorationClassByMainTypeId(3); //装修课堂 3 收尾阶段  6 条
        //12.首页banner
        List<BannerTablePo> bannerTablePoList = bannerTableService.findAllByBannerType(1);
//        BannerPicResponse bannerPicResponse = new BannerPicResponse();
//        bannerPicResponse.setBannerOne(bannerTablePoList.get(0));
//        bannerPicResponse.setBannerTwo(bannerTablePoList.get(1));
//        bannerPicResponse.setBannerThree(bannerTablePoList.get(2));
//        bannerPicResponse.setBannerFour(bannerTablePoList.get(3));
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
        mainDataListResponse.setDecorationStyleList(productCaseTypeList);
        mainDataListResponse.setBannerTablePoList(bannerTablePoList);
        mainDataListResponse.setVrOne(vrScenesList.get(0));
        mainDataListResponse.setVrTwo(vrScenesList.get(1));
        mainDataListResponse.setVrThree(vrScenesList.get(2));
        return mainDataListResponse;
    }
}
