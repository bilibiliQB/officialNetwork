package com.dute.officialNetwork.domain.entity;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zhanghongwei on 2018/7/10.
 */
@Entity
@Table(name = "cooperative_partner")
@DynamicUpdate
@DynamicInsert
public class CooperativePartner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cooperative_partner_id", updatable = false)
    private Integer id;// ID

    @Column(name = "cooperative_partner_img_url")
    private String cooperativePartnerImg_url; // 合作品牌图片地址

    @Column(name = "cooperative_partner_order")
    private Integer cooperativePartnerOrder; // 合作品牌排序

    @Column(name = "cooperative_partner_create_time")
    private Date cooperativePartnerCreateTime; // 合作品牌创建时间

    @Column(name = "cooperative_partner_is_show")
    private Integer cooperativePartnerIsShow; // 合作品牌是否展示

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCooperativePartnerImg_url() {
        return cooperativePartnerImg_url;
    }

    public void setCooperativePartnerImg_url(String cooperativePartnerImg_url) {
        this.cooperativePartnerImg_url = cooperativePartnerImg_url;
    }

    public Integer getCooperativePartnerOrder() {
        return cooperativePartnerOrder;
    }

    public void setCooperativePartnerOrder(Integer cooperativePartnerOrder) {
        this.cooperativePartnerOrder = cooperativePartnerOrder;
    }

    public Date getCooperativePartnerCreateTime() {
        return cooperativePartnerCreateTime;
    }

    public void setCooperativePartnerCreateTime(Date cooperativePartnerCreateTime) {
        this.cooperativePartnerCreateTime = cooperativePartnerCreateTime;
    }

    public Integer getCooperativePartnerIsShow() {
        return cooperativePartnerIsShow;
    }

    public void setCooperativePartnerIsShow(Integer cooperativePartnerIsShow) {
        this.cooperativePartnerIsShow = cooperativePartnerIsShow;
    }
}
