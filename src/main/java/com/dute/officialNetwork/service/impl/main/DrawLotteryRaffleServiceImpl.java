package com.dute.officialNetwork.service.impl.main;

import com.dute.officialNetwork.domain.entity.DrawLotteryRaffle;
import com.dute.officialNetwork.domain.repository.main.DrawLotteryRaffleRepository;
import com.dute.officialNetwork.service.interfaces.main.IDrawLotteryRaffleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<DrawLotteryRaffle> findAll() {
        return drawLotteryRaffleRepository.findAll();
    }
}
