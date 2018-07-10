package com.dute.officialNetwork.service.impl.main;

import com.dute.officialNetwork.api.po.DrawLotteryRafflePo;
import com.dute.officialNetwork.domain.entity.DrawLotteryRaffle;
import com.dute.officialNetwork.domain.repository.main.DrawLotteryRaffleRepository;
import com.dute.officialNetwork.service.interfaces.main.IDrawLotteryRaffleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhanghongwei on 2018/7/9.
 */
@Service
public class DrawLotteryRaffleServiceImpl implements IDrawLotteryRaffleService {
    @Autowired
    private DrawLotteryRaffleRepository drawLotteryRaffleRepository;

    @Override
    public DrawLotteryRaffle findById(int i) {
        return drawLotteryRaffleRepository.findById(i).get();
    }

    @Override
    public List<DrawLotteryRafflePo> findAll() {
        List<DrawLotteryRafflePo> list = new ArrayList<>();
        for(DrawLotteryRaffle drawLotteryRaffle : drawLotteryRaffleRepository.findAll()){
            DrawLotteryRafflePo drawLotteryRafflePo = new DrawLotteryRafflePo();
            BeanUtils.copyProperties(drawLotteryRaffle,drawLotteryRafflePo);
            list.add(drawLotteryRafflePo);
        }
        return list;
    }
}
