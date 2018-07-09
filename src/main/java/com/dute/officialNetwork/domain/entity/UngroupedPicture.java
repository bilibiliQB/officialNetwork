package com.dute.officialNetwork.domain.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zhanghongwei on 2018/7/9.
 */
@Entity
@Table(name = "ungrouped_picture")
@DynamicInsert
@DynamicUpdate
public class UngroupedPicture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "up_id", updatable = false)
    private Integer id;// 无分组图片编号

    @Column(name = "up_content")
    private String upContent; // 无分组图片描述

    @Column(name = "up_img_url")
    private String upImgUrl; // 无分组图片地址

    @Column(name = "up_create_time")
    private Date upCreateTime; // 无分组图片创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUpContent() {
        return upContent;
    }

    public void setUpContent(String upContent) {
        this.upContent = upContent;
    }

    public String getUpImgUrl() {
        return upImgUrl;
    }

    public void setUpImgUrl(String upImgUrl) {
        this.upImgUrl = upImgUrl;
    }

    public Date getUpCreateTime() {
        return upCreateTime;
    }

    public void setUpCreateTime(Date upCreateTime) {
        this.upCreateTime = upCreateTime;
    }
}
