package com.dute.officialNetwork.domain.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zhanghongwei on 2018/7/10.
 */
@Entity
@Table(name = "integral_decoration")
@DynamicInsert
@DynamicUpdate
public class IntegralDecoration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Integral_decoration_id", updatable = false)
    private Integer id;// ID

    @Column(name = "Integral_decoration_name")
    private String IntegralDecorationName; // 整装名称

    @Column(name = "Integral_decoration_english_name")
    private String IntegralDecorationEnglishName; // 整装英文名称

    @Column(name = "Integral_decoration_content")
    private String IntegralDecorationContent; // 整装描述

    @Column(name = "Integral_decoration_price")
    private Integer IntegralDecorationPrice; //整装价格

    @Column(name = "Integral_decoration_unit")
    private String IntegralDecorationUnit; //整装价格单位

    @Column(name = "Integral_decoration_area_unit")
    private String IntegralDecorationAreaUnit; //整装面积单位

    @Column(name = "Integral_decoration_create_time")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date IntegralDecorationCreateTime; //整装数据插入时间

    @Column(name = "Integral_decoration_order")
    private Integer IntegralDecorationOrder; //整装排序

    @Column(name = "Integral_decoration_is_show")
    private Integer IntegralDecorationIsShow; //整装是否展示

    @OneToMany
    @JoinTable(name = "integral_decoration_img")


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntegralDecorationName() {
        return IntegralDecorationName;
    }

    public void setIntegralDecorationName(String integralDecorationName) {
        IntegralDecorationName = integralDecorationName;
    }

    public String getIntegralDecorationEnglishName() {
        return IntegralDecorationEnglishName;
    }

    public void setIntegralDecorationEnglishName(String integralDecorationEnglishName) {
        IntegralDecorationEnglishName = integralDecorationEnglishName;
    }

    public String getIntegralDecorationContent() {
        return IntegralDecorationContent;
    }

    public void setIntegralDecorationContent(String integralDecorationContent) {
        IntegralDecorationContent = integralDecorationContent;
    }

    public Integer getIntegralDecorationPrice() {
        return IntegralDecorationPrice;
    }

    public void setIntegralDecorationPrice(Integer integralDecorationPrice) {
        IntegralDecorationPrice = integralDecorationPrice;
    }

    public String getIntegralDecorationUnit() {
        return IntegralDecorationUnit;
    }

    public void setIntegralDecorationUnit(String integralDecorationUnit) {
        IntegralDecorationUnit = integralDecorationUnit;
    }

    public String getIntegralDecorationAreaUnit() {
        return IntegralDecorationAreaUnit;
    }

    public void setIntegralDecorationAreaUnit(String integralDecorationAreaUnit) {
        IntegralDecorationAreaUnit = integralDecorationAreaUnit;
    }

    public Date getIntegralDecorationCreateTime() {
        return IntegralDecorationCreateTime;
    }

    public void setIntegralDecorationCreateTime(Date integralDecorationCreateTime) {
        IntegralDecorationCreateTime = integralDecorationCreateTime;
    }

    public Integer getIntegralDecorationOrder() {
        return IntegralDecorationOrder;
    }

    public void setIntegralDecorationOrder(Integer integralDecorationOrder) {
        IntegralDecorationOrder = integralDecorationOrder;
    }

    public Integer getIntegralDecorationIsShow() {
        return IntegralDecorationIsShow;
    }

    public void setIntegralDecorationIsShow(Integer integralDecorationIsShow) {
        IntegralDecorationIsShow = integralDecorationIsShow;
    }
}
