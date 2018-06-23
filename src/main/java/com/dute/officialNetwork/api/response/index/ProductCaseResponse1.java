package com.dute.officialNetwork.api.response.index;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.dute.officialNetwork.domain.entity.ProductCase;

import io.swagger.annotations.ApiModelProperty;

public class ProductCaseResponse1 {
	
	@ApiModelProperty("返回当前第几页")
	private Integer currentPageNumber;

	@ApiModelProperty("返回当前总页数")
	private Integer pageCount;

	private List<ProductCaseRequest> productCaseRequests = new ArrayList<>();

	public void copyProperties(ProductCase pc) {
		ProductCaseRequest pcr = new ProductCaseRequest();
		BeanUtils.copyProperties(pc, pcr);
		BeanUtils.copyProperties(pc.getProductCaseType(), pcr.getProductCaseTypeResponse());
		productCaseRequests.add(pcr);
		pcr = null;
	}

	public Integer getCurrentPageNumber() {
		return currentPageNumber;
	}

	public void setCurrentPageNumber(Integer currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public List<ProductCaseRequest> getProductCaseRequests() {
		return productCaseRequests;
	}

	public void setProductCaseRequests(List<ProductCaseRequest> productCaseRequests) {
		this.productCaseRequests = productCaseRequests;
	}

	class ProductCaseRequest {
		@ApiModelProperty("返回编号")
		private Long id;

		@ApiModelProperty("返回面积")
		private Integer area;

		@ApiModelProperty("返回简介")
		private String shortIntroduction;

		@ApiModelProperty("返回首页图地址")
		private String firstPicPath;

		private ProductCaseTypeResponse productCaseTypeResponse = new ProductCaseTypeResponse(); // 案例类型

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getArea() {
			return area;
		}

		public void setArea(Integer area) {
			this.area = area;
		}

		public String getShortIntroduction() {
			return shortIntroduction;
		}

		public void setShortIntroduction(String shortIntroduction) {
			this.shortIntroduction = shortIntroduction;
		}

		public String getFirstPicPath() {
			return firstPicPath;
		}

		public void setFirstPicPath(String firstPicPath) {
			this.firstPicPath = firstPicPath;
		}

		public ProductCaseTypeResponse getProductCaseTypeResponse() {
			return productCaseTypeResponse;
		}

		public void setProductCaseTypeResponse(ProductCaseTypeResponse productCaseTypeResponse) {
			this.productCaseTypeResponse = productCaseTypeResponse;
		}

		class ProductCaseTypeResponse {
			@ApiModelProperty("返回简称")
			private String shortName;

			public String getShortName() {
				return shortName;
			}

			public void setShortName(String shortName) {
				this.shortName = shortName;
			}

		}
	}
}
