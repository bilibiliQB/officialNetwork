package com.dute.officialNetwork.api.po;

import com.alibaba.fastjson.annotation.JSONField;
import com.dute.officialNetwork.domain.entity.DesignerInformation;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

public class VRScenesPo implements Serializable {
    @ApiModelProperty("ID")
    private Long id;// ID

    @ApiModelProperty("名称")
    private String name; // 名称

//    @ApiModelProperty("所属设计师")
//    private DesignerInformation designerInformation; // 所属设计师

    @ApiModelProperty("创建时间")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date createTime; // 创建时间

    @ApiModelProperty("修改时间")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date modifyTime; // 修改时间

    @ApiModelProperty("VR图片的地址")
    private String vsImgUrl; //VR图片的地址

    @ApiModelProperty("VR地址")
    private String vsHerfPath; //VR地址

    @ApiModelProperty("vr顺序")
    private Integer vsOrder; //vr顺序

    @ApiModelProperty("vr所属设计师编号")
    private Integer vsDesignerId;

    @ApiModelProperty("首页 vr 首位展示大规格图片链接")
    private String vsIndexOnePath;

    public String getVsIndexOnePath() {
        return vsIndexOnePath;
    }

    public void setVsIndexOnePath(String vsIndexOnePath) {
        this.vsIndexOnePath = vsIndexOnePath;
    }

    public Integer getVsOrder() {
        return vsOrder;
    }

    public void setVsOrder(Integer vsOrder) {
        this.vsOrder = vsOrder;
    }

    public Integer getVsDesignerId() {
        return vsDesignerId;
    }

    public void setVsDesignerId(Integer vsDesignerId) {
        this.vsDesignerId = vsDesignerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public DesignerInformation getDesignerInformation() {
//        return designerInformation;
//    }
//
//    public void setDesignerInformation(DesignerInformation designerInformation) {
//        this.designerInformation = designerInformation;
//    }

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

    public String getVsImgUrl() {
        return vsImgUrl;
    }

    public void setVsImgUrl(String vsImgUrl) {
        this.vsImgUrl = vsImgUrl;
    }

    public String getVsHerfPath() {
        return vsHerfPath;
    }

    public void setVsHerfPath(String vsHerfPath) {
        this.vsHerfPath = vsHerfPath;
    }
}
