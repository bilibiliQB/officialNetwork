package com.dute.officialNetwork.service.interfaces.main;

import com.dute.officialNetwork.api.po.DrawLotteryRafflePo;
import com.dute.officialNetwork.domain.entity.DrawLotteryRaffle;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/7/9.
 */
public interface IDrawLotteryRaffleService {
    DrawLotteryRaffle findById(int i);

    List<DrawLotteryRafflePo> findAll();
}
