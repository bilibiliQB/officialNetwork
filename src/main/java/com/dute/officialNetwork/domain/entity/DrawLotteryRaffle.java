package com.dute.officialNetwork.domain.entity;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhanghongwei on 2018/7/9.
 */
@Entity
@Table(name = "draw_lottery_raffle")
@DynamicInsert
@DynamicUpdate
public class DrawLotteryRaffle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "draw_id", updatable = false)
    private Integer id;// 奖品图片编号

    @Column(name = "draw_order")
    private Integer drawOrder; // 奖品图片编号

    @Column(name = "draw_img_url")
    private String drawImgUrl; // 奖品图片地址

    @Column(name = "deaw_create_time")
    private Date deawCreateTime; // 奖品图片创建时间

    @Column(name = "draw_name")
    private String drawName; //奖品名称

    public String getDrawName() {
        return drawName;
    }

    public void setDrawName(String drawName) {
        this.drawName = drawName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrawImgUrl() {
        return drawImgUrl;
    }

    public void setDrawImgUrl(String drawImgUrl) {
        this.drawImgUrl = drawImgUrl;
    }

    public Integer getDrawOrder() {
        return drawOrder;
    }

    public void setDrawOrder(Integer drawOrder) {
        this.drawOrder = drawOrder;
    }

    public Date getDeawCreateTime() {
        return deawCreateTime;
    }

    public void setDeawCreateTime(Date deawCreateTime) {
        this.deawCreateTime = deawCreateTime;
    }
}
