package com.dute.officialNetwork.api.po;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class ProductCaseTypePo implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty("ID")
    private Integer id;// ID

    @ApiModelProperty("全称")
    private String fullName; // 全称

    @ApiModelProperty("简称")
    private String shortName; // 简称

    @ApiModelProperty("英语名称")
    private String englishName; // 英语名称

    @ApiModelProperty("简评")
    private String shortIntroduction; // 简评

    @ApiModelProperty("首页图")
    private String firstPicPath; // 首页图

    @ApiModelProperty("每平价格")
    private Integer price; // 每平价格

    @ApiModelProperty("创建时间")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date createTime; // 创建时间

    @ApiModelProperty("修改时间")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date modifyTime; // 修改时间

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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
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

    public String getFirstPicPath() {
        return firstPicPath;
    }

    public void setFirstPicPath(String firstPicPath) {
        this.firstPicPath = firstPicPath;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
