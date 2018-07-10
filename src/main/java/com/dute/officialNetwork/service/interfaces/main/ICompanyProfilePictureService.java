package com.dute.officialNetwork.service.interfaces.main;

import com.dute.officialNetwork.api.po.CompanyProfilePicturePo;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/7/9.
 */
public interface ICompanyProfilePictureService {
    List<CompanyProfilePicturePo> findAll();
}
