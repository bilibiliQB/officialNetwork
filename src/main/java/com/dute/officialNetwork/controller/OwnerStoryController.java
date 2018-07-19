package com.dute.officialNetwork.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dute.officialNetwork.api.request.index.OwnerStoryRequest0;
import com.dute.officialNetwork.api.response.index.OwnerStoryResponse0;
import com.dute.officialNetwork.api.response.index.OwnerStoryResponse1;
import com.dute.officialNetwork.domain.entity.OwnerStory;
import com.dute.officialNetwork.service.interfaces.OwnerStoryService;
import com.dute.officialNetwork.util.ResultData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "业主故事相关")
@RestController
@RequestMapping("/ownerStory")
public class OwnerStoryController {

	@Autowired
	private OwnerStoryService oss;

	@ApiOperation("获取所有业主故事")
	@PostMapping("/getOwnerStoryList")
	public ResultData<OwnerStoryResponse0> getAll(OwnerStoryRequest0 osq) {
		ResultData<OwnerStoryResponse0> result = new ResultData<>();
		OwnerStoryResponse0 osp = new OwnerStoryResponse0();
		try {
			Page<OwnerStory> pos = null;
			if (osq.getKeywords() == null) {
				// 关键字为null调用的方法
				pos = oss.findAll(PageRequest.of(osq.getPageNumber() - 1, osq.getShowCount()));
			} else {
				// 关键字为不为null调用的方法
				pos = oss.findAllByKeywordsLike(osq.getKeywords(),
						PageRequest.of(osq.getPageNumber() - 1, osq.getShowCount()));
			}
			osp.setCurrentPageNumber(osq.getPageNumber());
			osp.setPageCount(pos.getTotalPages());
			for (OwnerStory os : pos.getContent()) {
				osp.copyProperties(os);
			}
			result.setData(osp);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}

	@ApiOperation("根据ID获取业主故事文章详情页")
	@PostMapping("/getOneById/{id}")
	public ResultData<OwnerStoryResponse1> getDecorationClass4(@PathVariable Long id) {
		ResultData<OwnerStoryResponse1> result = new ResultData<>();
		OwnerStoryResponse1 osp = new OwnerStoryResponse1();
		try {
			OwnerStory os = oss.getOneById(id);
			// 更新浏览数
			if (os != null) {
				os.setViewingCount(os.getViewingCount() + 1);
				oss.updateOne(os);
			}
			BeanUtils.copyProperties(os, osp);
			result.setData(osp);
			result.setStatus(ResultData.CODE_SUCCESS);
		} catch (Exception e) {
			result.setStatus(ResultData.CODE_FAIL_BIZ);
			result.setMessage(e.getMessage());
		}
		return result;
	}

}
