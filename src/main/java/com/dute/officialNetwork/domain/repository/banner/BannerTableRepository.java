package com.dute.officialNetwork.domain.repository.banner;

import com.dute.officialNetwork.domain.entity.BannerTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/7/30.
 */
public interface BannerTableRepository extends JpaRepository<BannerTable,Integer> {
    List<BannerTable> findAllByBannerTypeOrderByBannerOrderAsc(int i);
}
