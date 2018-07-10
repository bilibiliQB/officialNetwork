package com.dute.officialNetwork.domain.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * 独特视频
 */
@Entity
@Table(name = "unique_vedio")
@DynamicInsert
@DynamicUpdate
public class UniqueVedio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unique_vedio_id", updatable = false)
    private Long id;// ID

    @Column(name = "unique_vedio_name")
    private String uniqueVedioName; // 视频名称

    @Column(name = "unique_vedio_url")
    private Date uniqueVedioUrl; // 视频链接

    @Column(name = "unique_vedio_order")
    private Integer uniqueVedioOrder;  //排序标识

    @Column(name = "unique_vedio_create_time")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date uniqueVedioCreateTime; // 插入时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUniqueVedioName() {
        return uniqueVedioName;
    }

    public void setUniqueVedioName(String uniqueVedioName) {
        this.uniqueVedioName = uniqueVedioName;
    }

    public Date getUniqueVedioUrl() {
        return uniqueVedioUrl;
    }

    public void setUniqueVedioUrl(Date uniqueVedioUrl) {
        this.uniqueVedioUrl = uniqueVedioUrl;
    }

    public Integer getUniqueVedioOrder() {
        return uniqueVedioOrder;
    }

    public void setUniqueVedioOrder(Integer uniqueVedioOrder) {
        this.uniqueVedioOrder = uniqueVedioOrder;
    }

    public Date getUniqueVedioCreateTime() {
        return uniqueVedioCreateTime;
    }

    public void setUniqueVedioCreateTime(Date uniqueVedioCreateTime) {
        this.uniqueVedioCreateTime = uniqueVedioCreateTime;
    }
}
