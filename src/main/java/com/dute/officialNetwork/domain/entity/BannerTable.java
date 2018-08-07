package com.dute.officialNetwork.domain.entity;

import jdk.nashorn.internal.objects.annotations.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "banner_table")
@DynamicInsert
@DynamicUpdate
public class BannerTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "banner_id", updatable = false)
    private Integer id;// banner图片编号

    @Column(name = "banner_type")
    private Integer bannerType; // banner类型

    @Column(name = "banner_url")
    private String bannerUrl; // banner地址

    @Column(name = "banner_order")
    private Integer bannerOrder; // banner排序

    @Column(name = "banner_href")
    private String bannerHref; // banner跳转地址



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBannerType() {
        return bannerType;
    }

    public void setBannerType(Integer bannerType) {
        this.bannerType = bannerType;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public Integer getBannerOrder() {
        return bannerOrder;
    }

    public void setBannerOrder(Integer bannerOrder) {
        this.bannerOrder = bannerOrder;
    }

    public String getBannerHref() {
        return bannerHref;
    }

    public void setBannerHref(String bannerHref) {
        this.bannerHref = bannerHref;
    }
}
