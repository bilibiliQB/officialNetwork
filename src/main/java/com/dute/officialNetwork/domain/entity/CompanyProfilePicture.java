package com.dute.officialNetwork.domain.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "company_profile_picture")
@DynamicInsert
@DynamicUpdate
public class CompanyProfilePicture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pic_id", updatable = false)
    private Integer id;// ID

    @Column(name = "pic_url")
    private String mainTitle; // 地址

    @Column(name = "pic_order")
    private Integer subTitle; // 排序

    @Column(name = "pic_createtime")
    private Date authorName; // 创建时间
}
