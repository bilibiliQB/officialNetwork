package com.dute.officialNetwork.api.response.index;

import io.swagger.annotations.ApiModelProperty;

public class CorporateNewsResponse1 extends BasisArticleDetails {

	@ApiModelProperty("下一篇")
	private CorporateNewsPo next = new CorporateNewsPo();

	@ApiModelProperty("上一篇")
	private CorporateNewsPo prvie = new CorporateNewsPo();

	public CorporateNewsPo getNext() {
		return next;
	}

	public void setNext(CorporateNewsPo next) {
		this.next = next;
	}

	public CorporateNewsPo getPrvie() {
		return prvie;
	}

	public void setPrvie(CorporateNewsPo prvie) {
		this.prvie = prvie;
	}

	class CorporateNewsPo {

		private Integer id;

		private String mainTitle;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getMainTitle() {
			return mainTitle;
		}

		public void setMainTitle(String mainTitle) {
			this.mainTitle = mainTitle;
		}

	}
}
