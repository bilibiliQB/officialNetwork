package com.dute.officialNetwork.service.interfaces.banner;

import com.dute.officialNetwork.api.po.BannerTablePo;
import com.dute.officialNetwork.domain.entity.BannerTable;
import com.dute.officialNetwork.domain.repository.banner.BannerTableRepository;
import com.dute.officialNetwork.service.impl.banner.IBannerTableService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhanghongwei on 2018/7/30.
 */
@Service
public class BannerTableServiceImpl implements IBannerTableService {
    @Autowired
    private BannerTableRepository bannerTableRepository;
    @Override
    public List<BannerTablePo> findAllByBannerType(int i) {
        List<BannerTablePo> bannerTablePoList = new ArrayList<>();
        for(BannerTable bannerTable : bannerTableRepository.findAllByBannerType(1)){
            BannerTablePo bannerTablePo = new BannerTablePo();
            BeanUtils.copyProperties(bannerTable,bannerTablePo);
            bannerTablePoList.add(bannerTablePo);
        }
        return bannerTablePoList;
    }
}
