package com.dute.officialNetwork.service.impl.integraldecoration;

import com.dute.officialNetwork.api.po.HdCasesPo;
import com.dute.officialNetwork.api.po.IntegralDecorationImgPo;
import com.dute.officialNetwork.api.po.IntegralDecorationPo;
import com.dute.officialNetwork.domain.entity.IntegralDecoration;
import com.dute.officialNetwork.domain.entity.IntegralDecorationImg;
import com.dute.officialNetwork.domain.repository.integraldecoration.IntegralDecorationRepository;
import com.dute.officialNetwork.service.interfaces.hdcases.IHdCasesService;
import com.dute.officialNetwork.service.interfaces.integraldecoration.IIntegralDecorationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IntegralDecorationServiceImpl implements IIntegralDecorationService {
    @Autowired
    private IntegralDecorationRepository integralDecorationRepository;

    @Autowired
    private IHdCasesService hdCasesService;

    @Override
    public List<IntegralDecorationPo> findAll() {
        List<IntegralDecorationPo> list = new ArrayList<>();
        for(IntegralDecoration integralDecoration : integralDecorationRepository.findAll()){
            //复制对象
            IntegralDecorationPo integralDecorationPo = new IntegralDecorationPo();

            String integralDecorationContent = integralDecoration.getIntegralDecorationContent();
            //创建数组
//            String[] integralDecorationContents_2 = new String[2];
//            String[] integralDecorationContents_3 = new String[3];

            BeanUtils.copyProperties(integralDecoration,integralDecorationPo);

            //直接把字符串拆分成长度一样的字符串数组
            int size = integralDecorationContent.length() / 19;
            if (integralDecorationContent.length() % 19 != 0) {
                size += 1;
            }

            String[] integralDecorationContents_1 = new String[size];

            for (int index = 0; index < size; index++) {
                int start = index * 19;
                int end = 19 * (index + 1);
                if(end > integralDecorationContent.length()){
                    end = integralDecorationContent.length();
                }
                String substring = integralDecorationContent.substring(start, end);
                integralDecorationContents_1[index] = substring;
            }

            integralDecorationPo.setIntegralDecorationContents(integralDecorationContents_1);

//            if(integralDecorationContent.length() >= 19 ){
//                integralDecorationContents_2[0] = integralDecorationContent.substring(0, 19);
//                integralDecorationContents_3[0] = integralDecorationContent.substring(0, 19);
//                //判断剩下的数据
//                String substring = integralDecorationContent.substring(19, integralDecorationContent.length());
//                if(substring.length() >= 19){
//                    integralDecorationContents_3[1] = substring.substring(0, 19);
//                    integralDecorationContents_3[2] = substring.substring(19, substring.length());
//                    integralDecorationPo.setIntegralDecorationContents(integralDecorationContents_3);
//                }else{
//                    integralDecorationContents_2[1] = substring;
//                    integralDecorationPo.setIntegralDecorationContents(integralDecorationContents_2);
//                }
//            }else{
//                integralDecorationContents_1[0] = integralDecorationContent;
//                integralDecorationPo.setIntegralDecorationContents(integralDecorationContents_1);
//            }
            //处理图片集合
//            List<IntegralDecorationImg> integralDecorationImgList = integralDecoration.getIntegralDecorationImgList();
//            List<IntegralDecorationImgPo> integralDecorationImgPoList = new ArrayList<>();
//            for(IntegralDecorationImg integralDecorationImg : integralDecorationImgList){
//                IntegralDecorationImgPo integralDecorationImgPo = new IntegralDecorationImgPo();
//                integralDecorationImgPo.setIntegralDecorationImgUrl(integralDecorationImg.getIntegralDecorationImgUrl());
//                integralDecorationImgPo.setIntegralDecorationOrder(integralDecorationImg.getIntegralDecorationOrder());
//                integralDecorationImgPo.setId(integralDecorationImg.getId());
//                integralDecorationImgPoList.add(integralDecorationImgPo);
//            }
//
//            integralDecorationPo.setIntegralDecorationImgList(integralDecorationImgPoList);

            //根据类型获取高清案例的图片
            List<HdCasesPo> hdCasesPoList = hdCasesService.findByHdCasesStyle(new PageRequest(0,4,new Sort(Sort.Direction.ASC,"hdCasesOrder")),integralDecoration.getIntegralDecorationName());
            integralDecorationPo.setHdCasesPoList(hdCasesPoList);
            list.add(integralDecorationPo);
        }
        return list;
    }
}
