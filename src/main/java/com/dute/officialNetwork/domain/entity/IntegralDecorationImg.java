package com.dute.officialNetwork.domain.entity;


import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * 整装图片实体
 */
@Entity
@Table(name = "integral_decoration_img")
@DynamicInsert
@DynamicUpdate
public class IntegralDecorationImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "integral_decoration_pic_id", updatable = false)
    private Integer id;// ID

    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional = false)
    @JoinColumn(name = "integral_decoration_id")
    private IntegralDecoration integralDecoration; // 整装对象

    @Column(name = "integral_decoration_img_url")
    private String integralDecorationImgUrl; // 图片地址

    @Column(name = "integral_decoration_create_time")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date integral_decoration_create_time; // 插入时间

    @Column(name = "integral_decoration_order")
    private Integer integralDecorationOrder; // 图片顺序

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IntegralDecoration getIntegralDecoration() {
        return integralDecoration;
    }

    public void setIntegralDecoration(IntegralDecoration integralDecoration) {
        this.integralDecoration = integralDecoration;
    }

    public String getIntegralDecorationImgUrl() {
        return integralDecorationImgUrl;
    }

    public void setIntegralDecorationImgUrl(String integralDecorationImgUrl) {
        this.integralDecorationImgUrl = integralDecorationImgUrl;
    }

    public Date getIntegral_decoration_create_time() {
        return integral_decoration_create_time;
    }

    public void setIntegral_decoration_create_time(Date integral_decoration_create_time) {
        this.integral_decoration_create_time = integral_decoration_create_time;
    }

    public Integer getIntegralDecorationOrder() {
        return integralDecorationOrder;
    }

    public void setIntegralDecorationOrder(Integer integralDecorationOrder) {
        this.integralDecorationOrder = integralDecorationOrder;
    }
}
