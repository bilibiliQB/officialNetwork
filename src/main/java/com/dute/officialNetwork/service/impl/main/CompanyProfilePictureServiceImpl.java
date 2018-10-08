package com.dute.officialNetwork.service.impl.main;

import com.dute.officialNetwork.api.po.CompanyProfilePicturePo;
import com.dute.officialNetwork.domain.entity.CompanyProfilePicture;
import com.dute.officialNetwork.domain.repository.main.CompanyProfilePictureRepository;
import com.dute.officialNetwork.service.interfaces.main.ICompanyProfilePictureService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhanghongwei on 2018/7/9.
 */
@Service
public class CompanyProfilePictureServiceImpl implements ICompanyProfilePictureService {
    @Autowired
    private CompanyProfilePictureRepository companyProfilePictureRepository;

    @Override
    public List<CompanyProfilePicturePo> findAll() {
        List<CompanyProfilePicturePo> list = new ArrayList<>();
        for(CompanyProfilePicture companyProfilePicture : companyProfilePictureRepository.findAll()){
            CompanyProfilePicturePo companyProfilePicturePo = new CompanyProfilePicturePo();
            BeanUtils.copyProperties(companyProfilePicture,companyProfilePicturePo);
            list.add(companyProfilePicturePo);
        }
        return list;
    }
}
