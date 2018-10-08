package com.dute.officialNetwork.domain.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "company_profile_picture")
@DynamicInsert
@DynamicUpdate
public class CompanyProfilePicture  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pic_id", updatable = false)
    private Integer id;// ID

    @Column(name = "pic_url")
    private String picUrl; // 地址

    @Column(name = "pic_order")
    private Integer picOrder; // 排序

    @Column(name = "pic_createtime")
    private Date picCreatetime; // 创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getPicOrder() {
        return picOrder;
    }

    public void setPicOrder(Integer picOrder) {
        this.picOrder = picOrder;
    }

    public Date getPicCreatetime() {
        return picCreatetime;
    }

    public void setPicCreatetime(Date picCreatetime) {
        this.picCreatetime = picCreatetime;
    }
}
