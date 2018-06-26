package com.dute.officialNetwork.domain.entity;

import javax.persistence.*;

/**
 * Created by zhanghongwei on 2018/6/26.
 */
@Entity
@Table(name = "decoration_nav", schema = "officialnetwork", catalog = "")
public class DecorationNav {
    private String tabName;
    private Integer tabOrder;
    private String tabHerf;
    private Integer tabShow;
    private String navId;

    @Basic
    @Column(name = "tab_name")
    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    @Basic
    @Column(name = "tab_order")
    public Integer getTabOrder() {
        return tabOrder;
    }

    public void setTabOrder(Integer tabOrder) {
        this.tabOrder = tabOrder;
    }

    @Basic
    @Column(name = "tab_herf")
    public String getTabHerf() {
        return tabHerf;
    }

    public void setTabHerf(String tabHerf) {
        this.tabHerf = tabHerf;
    }

    @Basic
    @Column(name = "tab_show")
    public Integer getTabShow() {
        return tabShow;
    }

    public void setTabShow(Integer tabShow) {
        this.tabShow = tabShow;
    }

    @Id
    @Column(name = "nav_id")
    public String getNavId() {
        return navId;
    }

    public void setNavId(String navId) {
        this.navId = navId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DecorationNav that = (DecorationNav) o;

        if (tabName != null ? !tabName.equals(that.tabName) : that.tabName != null) return false;
        if (tabOrder != null ? !tabOrder.equals(that.tabOrder) : that.tabOrder != null) return false;
        if (tabHerf != null ? !tabHerf.equals(that.tabHerf) : that.tabHerf != null) return false;
        if (tabShow != null ? !tabShow.equals(that.tabShow) : that.tabShow != null) return false;
        if (navId != null ? !navId.equals(that.navId) : that.navId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tabName != null ? tabName.hashCode() : 0;
        result = 31 * result + (tabOrder != null ? tabOrder.hashCode() : 0);
        result = 31 * result + (tabHerf != null ? tabHerf.hashCode() : 0);
        result = 31 * result + (tabShow != null ? tabShow.hashCode() : 0);
        result = 31 * result + (navId != null ? navId.hashCode() : 0);
        return result;
    }
}
