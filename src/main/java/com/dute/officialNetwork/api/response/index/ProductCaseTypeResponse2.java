package com.dute.officialNetwork.api.response.index;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.dute.officialNetwork.domain.entity.ProductCase;

import io.swagger.annotations.ApiModelProperty;

public class ProductCaseTypeResponse2 {

	@ApiModelProperty("返回编号")
	private Integer id;

	@ApiModelProperty("返回全称")
	private String fullName;

	@ApiModelProperty("返回英称")
	private String englishName;

	@ApiModelProperty("返回简评")
	private String shortIntroduction;

	@ApiModelProperty("返回每平价格")
	private Integer price;

	private List<ProductCaseResponse> productCaseResponse = new ArrayList<>();

	public void copyProperties(ProductCase pc) {
		ProductCaseResponse pcr = new ProductCaseResponse();
		BeanUtils.copyProperties(pc, pcr);
		productCaseResponse.add(pcr);
		pcr = null;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getShortIntroduction() {
		return shortIntroduction;
	}

	public void setShortIntroduction(String shortIntroduction) {
		this.shortIntroduction = shortIntroduction;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public List<ProductCaseResponse> getProductCaseResponse() {
		return productCaseResponse;
	}

	public void setProductCaseResponse(List<ProductCaseResponse> productCaseResponse) {
		this.productCaseResponse = productCaseResponse;
	}

	class ProductCaseResponse {
		@ApiModelProperty("返回编号")
		private Long id;

		@ApiModelProperty("返回首页图地址")
		private String firstPicPath;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstPicPath() {
			return firstPicPath;
		}

		public void setFirstPicPath(String firstPicPath) {
			this.firstPicPath = firstPicPath;
		}
	}
}
