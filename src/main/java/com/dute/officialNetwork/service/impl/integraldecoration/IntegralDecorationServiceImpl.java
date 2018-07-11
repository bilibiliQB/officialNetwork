package com.dute.officialNetwork.service.impl.integraldecoration;

import com.dute.officialNetwork.api.po.IntegralDecorationImgPo;
import com.dute.officialNetwork.api.po.IntegralDecorationPo;
import com.dute.officialNetwork.domain.entity.IntegralDecoration;
import com.dute.officialNetwork.domain.entity.IntegralDecorationImg;
import com.dute.officialNetwork.domain.repository.integraldecoration.IntegralDecorationRepository;
import com.dute.officialNetwork.service.interfaces.integraldecoration.IIntegralDecorationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IntegralDecorationServiceImpl implements IIntegralDecorationService {
    @Autowired
    private IntegralDecorationRepository integralDecorationRepository;

    @Override
    public List<IntegralDecorationPo> findAll() {
        List<IntegralDecorationPo> list = new ArrayList<>();
        for(IntegralDecoration integralDecoration : integralDecorationRepository.findAll()){
            //复制对象
            IntegralDecorationPo integralDecorationPo = new IntegralDecorationPo();

            String integralDecorationContent = integralDecoration.getIntegralDecorationContent();
            //创建数组
            String[] integralDecorationContents_1 = new String[1];
            String[] integralDecorationContents_2 = new String[2];
            String[] integralDecorationContents_3 = new String[3];

            BeanUtils.copyProperties(integralDecoration,integralDecorationPo);

            if(integralDecorationContent.length() >= 17 ){
                integralDecorationContents_2[0] = integralDecorationContent.substring(0, 17);
                integralDecorationContents_3[0] = integralDecorationContent.substring(0, 17);
                //判断剩下的数据
                String substring = integralDecorationContent.substring(17, integralDecorationContent.length());
                if(substring.length() >= 15){
                    integralDecorationContents_3[1] = substring.substring(0, 15);
                    integralDecorationContents_3[2] = substring.substring(15, substring.length());
                    integralDecorationPo.setIntegralDecorationContents(integralDecorationContents_3);
                }else{
                    integralDecorationContents_2[1] = substring;
                    integralDecorationPo.setIntegralDecorationContents(integralDecorationContents_2);
                }
            }else{
                integralDecorationContents_1[0] = integralDecorationContent;
                integralDecorationPo.setIntegralDecorationContents(integralDecorationContents_1);
            }
            //处理图片集合
            List<IntegralDecorationImg> integralDecorationImgList = integralDecoration.getIntegralDecorationImgList();
            List<IntegralDecorationImgPo> integralDecorationImgPoList = new ArrayList<>();
            for(IntegralDecorationImg integralDecorationImg : integralDecorationImgList){
                IntegralDecorationImgPo integralDecorationImgPo = new IntegralDecorationImgPo();
                integralDecorationImgPo.setIntegralDecorationImgUrl(integralDecorationImg.getIntegralDecorationImgUrl());
                integralDecorationImgPo.setIntegralDecorationOrder(integralDecorationImg.getIntegralDecorationOrder());
                integralDecorationImgPo.setId(integralDecorationImg.getId());
                integralDecorationImgPoList.add(integralDecorationImgPo);
            }

            integralDecorationPo.setIntegralDecorationImgList(integralDecorationImgPoList);
            list.add(integralDecorationPo);
        }
        return list;
    }
}
