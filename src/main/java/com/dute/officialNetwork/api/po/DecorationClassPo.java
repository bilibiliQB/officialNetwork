package com.dute.officialNetwork.api.po;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class DecorationClassPo implements Serializable {
    
	private static final long serialVersionUID = 1L;

	@ApiModelProperty("ID")
    private Long id;// ID

    @ApiModelProperty("主标题")
    private String mainTitle; // 主标题

    @ApiModelProperty("副标题")
    private String subTitle; // 副标题

    @ApiModelProperty("简介")
    private String introduction; // 简介

    @ApiModelProperty("首页图")
    private String firstPicPath; // 首页图

    @ApiModelProperty("作者名称")
    private String authorName; // 作者名称

    @ApiModelProperty("浏览数")
    private Integer viewingCount; // 浏览数

//    @ApiModelProperty("所属副分类")
//    private DecorationClassSubType decorationClassSubType; // 所属副分类

    @ApiModelProperty("内容")
    private String content; // 内容

    @ApiModelProperty("关键字")
    private String keywords; // 关键字

    @ApiModelProperty("创建时间")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date createTime; // 创建时间

    @ApiModelProperty("修改时间")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date modifyTime; // 修改时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getFirstPicPath() {
        return firstPicPath;
    }

    public void setFirstPicPath(String firstPicPath) {
        this.firstPicPath = firstPicPath;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getViewingCount() {
        return viewingCount;
    }

    public void setViewingCount(Integer viewingCount) {
        this.viewingCount = viewingCount;
    }

//    public DecorationClassSubType getDecorationClassSubType() {
//        return decorationClassSubType;
//    }
//
//    public void setDecorationClassSubType(DecorationClassSubType decorationClassSubType) {
//        this.decorationClassSubType = decorationClassSubType;
//    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
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
