package com.dute.officialNetwork.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.api.response.index.CorporateNewsResponse0;
import com.dute.officialNetwork.api.response.index.CorporateNewsResponse1;
import com.dute.officialNetwork.domain.entity.CorporateNews;
import com.dute.officialNetwork.service.interfaces.CorporateNewsService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "企业新闻控制器")
@RestController
@RequestMapping("/corporateNews")
public class CorporateNewsController {

	@Autowired
	private CorporateNewsService cns;

	@ApiOperation("获取6条最新的企业新闻")
	@PostMapping("/get6CorporateNews")
	public ResultData<List<CorporateNewsResponse0>> getCorporateNewsList() {
		ResultData<List<CorporateNewsResponse0>> result = new ResultData<>();
		List<CorporateNewsResponse0> lcnr = new ArrayList<>();
		try {
			for (CorporateNews cn : cns.findAllCreateTimeDesc(PageRequest.of(0, 6))) {
				CorporateNewsResponse0 cnp = new CorporateNewsResponse0();
				cnp.setCreateTimeYearAndMonth(cn.getCreateTime());
				cnp.setCreateTimeDay(cn.getCreateTime());
				BeanUtils.copyProperties(cn, cnp);
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

	@ApiOperation("根据ID获取企业新闻文章详情信息")
	@PostMapping("/getNewsContent")
	public ResultData<CorporateNewsResponse1> getDecorationClass4(@RequestParam Integer id) {
		ResultData<CorporateNewsResponse1> result = new ResultData<>();
		CorporateNewsResponse1 cnr = new CorporateNewsResponse1();
		try {
			CorporateNews cn = cns.getOneById(id);
			// 更新浏览数
			if (cn != null) {
				cn.setViewingCount(cn.getViewingCount() + 1);
				cns.updateOne(cn);
			}
			BeanUtils.copyProperties(cn, cnr);
			result.setData(cnr);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
