package com.dute.officialNetwork.service.impl.main;

import com.dute.officialNetwork.domain.entity.CompanyProfilePicture;
import com.dute.officialNetwork.domain.repository.main.CompanyProfilePictureRepository;
import com.dute.officialNetwork.service.interfaces.main.ICompanyProfilePictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/7/9.
 */
@Service
public class CompanyProfilePictureServiceImpl implements ICompanyProfilePictureService {
    @Autowired
    private CompanyProfilePictureRepository companyProfilePictureRepository;

    @Override
    public List<CompanyProfilePicture> findAll() {
        return companyProfilePictureRepository.findAll();
    }
}
