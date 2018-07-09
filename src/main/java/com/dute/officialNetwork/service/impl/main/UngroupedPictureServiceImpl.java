package com.dute.officialNetwork.service.impl.main;

import com.dute.officialNetwork.domain.entity.UngroupedPicture;
import com.dute.officialNetwork.domain.repository.main.UngroupedPictureRespository;
import com.dute.officialNetwork.service.interfaces.main.IUngroupedPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhanghongwei on 2018/7/9.
 */
@Service
public class UngroupedPictureServiceImpl implements IUngroupedPictureService {
    @Autowired
    private UngroupedPictureRespository ungroupedPictureRespository;
    @Override
    public UngroupedPicture findById(int i) {
        return ungroupedPictureRespository.findById(i).get();
    }
}
