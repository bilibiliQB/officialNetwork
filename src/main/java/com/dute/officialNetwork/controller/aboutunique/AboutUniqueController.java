package com.dute.officialNetwork.controller.aboutunique;

import com.dute.officialNetwork.api.response.about.AboutMilestonDataResponse;
import com.dute.officialNetwork.api.response.about.AboutMilestonVideoResponse;
import com.dute.officialNetwork.api.response.about.CooperativePartnerDataResponse;
import com.dute.officialNetwork.api.response.index.CorporateNewsResponse0;
import com.dute.officialNetwork.domain.entity.CorporateNews;
import com.dute.officialNetwork.service.impl.cooperativepartner.CooperativePartnerServiceImpl;
import com.dute.officialNetwork.service.impl.milestone.MilestoneRecordServiceImpl;
import com.dute.officialNetwork.service.impl.uniquevedio.UniqueVedioServiceImpl;
import com.dute.officialNetwork.service.interfaces.CorporateNewsService;
import com.dute.officialNetwork.util.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(description = "关于独特页面相关")
@RestController
@RequestMapping("about/unique")
public class AboutUniqueController {
    @Autowired
    private MilestoneRecordServiceImpl milestoneRecordService;

    @Autowired
    private CorporateNewsService cns;

    @Autowired
    private UniqueVedioServiceImpl uniqueVedioService;

    @Autowired
    private CooperativePartnerServiceImpl cooperativePartnerService;

    @ApiOperation("获取发展历程（里程碑列表）")
    @PostMapping(value = "mileston")
    public ResultData<AboutMilestonDataResponse> getAboutMilestonData(){
        ResultData<AboutMilestonDataResponse> resultData = new ResultData<>();
        try {
            AboutMilestonDataResponse aboutMilestonDataResponse = new AboutMilestonDataResponse();
            aboutMilestonDataResponse.setList(milestoneRecordService.findAll());
            resultData.setData(aboutMilestonDataResponse);
        }catch (Exception e){
            resultData.setStatus(ResultData.CODE_FAIL_BIZ);
            resultData.setMessage(e.getMessage());
        }
        return resultData;
    }



	@ApiOperation("获取6条最新的企业新闻")
	@PostMapping("/get6CorporateNews")
	public ResultData<List<CorporateNewsResponse0>> getCorporateNewsList() {
		ResultData<List<CorporateNewsResponse0>> result = new ResultData<>();
		List<CorporateNewsResponse0> lcnr = new ArrayList<>();
		try {
			for (CorporateNews cn : cns.findAllCreateTimeDesc(PageRequest.of(0, 6))) {
				CorporateNewsResponse0 cnp = new CorporateNewsResponse0();
				BeanUtils.copyProperties(cn, cnp);
				cnp.setCreateTimeYearAndMonth(cn.getCreateTime());
				cnp.setCreateTimeDay(cn.getCreateTime());
				lcnr.add(cnp);
				cnp = null;
			}
			result.setData(lcnr);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}

    @ApiOperation("获取独特视频")
    @PostMapping(value = "milestonVideo")
    public ResultData<AboutMilestonVideoResponse> getAboutUniqueVedioData(){
        ResultData<AboutMilestonVideoResponse> resultData = new ResultData<>();
        try {
            AboutMilestonVideoResponse aboutMilestonVideoResponse = new AboutMilestonVideoResponse();
            aboutMilestonVideoResponse.setList(uniqueVedioService.findAll());
            resultData.setData(aboutMilestonVideoResponse);
        }catch (Exception e){
            resultData.setStatus(ResultData.CODE_FAIL_BIZ);
            resultData.setMessage(e.getMessage());
        }
        return resultData;
    }

    @ApiOperation("获取独特合作品牌标识")
    @PostMapping(value = "milestonCooperativePartner")
    public ResultData<CooperativePartnerDataResponse> getMilestonCooperativePartnerData(){
        ResultData<CooperativePartnerDataResponse> resultData = new ResultData<>();
        try {
            CooperativePartnerDataResponse cooperativePartnerDataResponse = new CooperativePartnerDataResponse();
            cooperativePartnerDataResponse.setList(cooperativePartnerService.findAll());
            resultData.setData(cooperativePartnerDataResponse);
        }catch (Exception e){
            resultData.setStatus(ResultData.CODE_FAIL_BIZ);
            resultData.setMessage(e.getMessage());
        }
        return resultData;
    }
}
