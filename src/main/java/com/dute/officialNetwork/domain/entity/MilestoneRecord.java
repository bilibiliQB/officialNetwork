package com.dute.officialNetwork.domain.entity;


import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * 里程碑实体
 */
@Entity
@Table(name = "milestone_record")
@DynamicInsert
@DynamicUpdate
public class MilestoneRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "milestone_id", updatable = false)
    private Long id;// ID

    @Column(name = "milestone_content")
    private String milestoneContent; // 里程碑内容

    @Column(name = "mileCstone_time")
    private Date milestoneTime; // 里程碑时间

    @Column(name = "milestone_create_time")
    @JSONField(format = "yyyy/MM/dd HH:mm:ss")
    private Date milestoneCreateTime; // 插入时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMilestoneContent() {
        return milestoneContent;
    }

    public void setMilestoneContent(String milestoneContent) {
        this.milestoneContent = milestoneContent;
    }

    public Date getMilestoneTime() {
        return milestoneTime;
    }

    public void setMilestoneTime(Date milestoneTime) {
        this.milestoneTime = milestoneTime;
    }

    public Date getMilestoneCreateTime() {
        return milestoneCreateTime;
    }

    public void setMilestoneCreateTime(Date milestoneCreateTime) {
        this.milestoneCreateTime = milestoneCreateTime;
    }
}
