package com.dute.officialNetwork.service.impl.hdcases;

import com.dute.officialNetwork.api.em.CaseAreaEnum;
import com.dute.officialNetwork.api.em.CaseSizeEnum;
import com.dute.officialNetwork.api.em.CaseStyleEnum;
import com.dute.officialNetwork.api.po.HdCasesPo;
import com.dute.officialNetwork.api.request.hdcases.HdCasesRequest;
import com.dute.officialNetwork.api.response.hdcases.HdCasesResponse;
import com.dute.officialNetwork.api.response.hdcases.HdSelectResponse;
import com.dute.officialNetwork.domain.entity.HdCases;
import com.dute.officialNetwork.domain.repository.hdcases.HdCasesRepository;
import com.dute.officialNetwork.service.interfaces.hdcases.IHdCasesService;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class HdCasesServiceImpl implements IHdCasesService {
    @Autowired
    private HdCasesRepository hdCasesRepository;


    @Override
    public HdCasesResponse findByRequest(HdCasesRequest hdCasesRequest) {
        //根据传值匹配枚举
        String areas = CaseAreaEnum.get(hdCasesRequest.getAreasFlag()).getArerValue();

        String style = CaseStyleEnum.get(hdCasesRequest.getStyleFlag()).getArerValue();

        String size = CaseSizeEnum.get(hdCasesRequest.getSizeFlag()).getArerValue();

        List<HdCasesPo> list = new ArrayList<>();
        PageRequest pageRequest = new PageRequest(hdCasesRequest.getPageNumber()-1,12,new Sort(Sort.Direction.DESC,"hdCasesOrder"));
        //创建多条件查询对象
        Specification specification = new Specification<HdCases>(){
            @Override
            public Predicate toPredicate(Root<HdCases> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path<Integer> hdCasesArea = root.get("hdCasesArea");
                Path<String> hdCasesStyle = root.get("hdCasesStyle");
                Path<String> hdCasesSize = root.get("hdCasesSize");
                List<Predicate> predicates = new ArrayList<>();
                if(style != null && !"".equals(style)){
                    predicates.add(criteriaBuilder.like(hdCasesStyle,style));
                }
                if(size != null && !"".equals(size)){
                    predicates.add(criteriaBuilder.like(hdCasesSize,size));
                }
                if(areas != null && !"".equals(areas)){
                    String[] split = areas.split("-");
                    if(split.length == 1){
                        if("60".equals(split[0])){
                            predicates.add(criteriaBuilder.lt(hdCasesArea,Integer.parseInt(split[0])));
                        }else{
                            predicates.add(criteriaBuilder.gt(hdCasesArea,Integer.parseInt(split[0])));
                        }
                    }else{
                        predicates.add(criteriaBuilder.between(hdCasesArea,Integer.parseInt(split[0]),Integer.parseInt(split[1])));
                    }
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
        Page<HdCases> page = hdCasesRepository.findAll(specification, pageRequest);
        List<HdCases> hdCasesList = page.getContent();
        for(HdCases hdCases : hdCasesList){
            HdCasesPo hdCasesPo = new HdCasesPo();
            BeanUtils.copyProperties(hdCases,hdCasesPo);
            list.add(hdCasesPo);
        }

        //返回筛选条件
        ArrayList<HdSelectResponse> caseSizeEnumList = Lists.newArrayList();
        for(CaseSizeEnum caseSizeEnum : CaseSizeEnum.values()){
            HdSelectResponse hdSelectResponse = new HdSelectResponse();
            hdSelectResponse.setFalg(caseSizeEnum.getAreaFlag());
            hdSelectResponse.setName(caseSizeEnum.getAreaContent());
            caseSizeEnumList.add(hdSelectResponse);
        }
        ArrayList<HdSelectResponse> caseStyleEnumList = Lists.newArrayList();
        for(CaseStyleEnum caseStyleEnum : CaseStyleEnum.values()){
            HdSelectResponse hdSelectResponse = new HdSelectResponse();
            hdSelectResponse.setFalg(caseStyleEnum.getAreaFlag());
            hdSelectResponse.setName(caseStyleEnum.getAreaContent());
            caseStyleEnumList.add(hdSelectResponse);
        }
        ArrayList<HdSelectResponse> caseAreaEnumList = Lists.newArrayList();
        for(CaseAreaEnum caseAreaEnum : CaseAreaEnum.values()){
            HdSelectResponse hdSelectResponse = new HdSelectResponse();
            hdSelectResponse.setFalg(caseAreaEnum.getAreaFlag());
            hdSelectResponse.setName(caseAreaEnum.getAreaContent());
            caseAreaEnumList.add(hdSelectResponse);
        }
        HdCasesResponse hdCasesResponse = new HdCasesResponse();
        hdCasesResponse.setList(list);
        hdCasesResponse.setCaseAreaList(caseAreaEnumList);
        hdCasesResponse.setCaseSizeList(caseSizeEnumList);
        hdCasesResponse.setCaseStyleList(caseStyleEnumList);
        hdCasesResponse.setTotal(page.getTotalElements());
        hdCasesResponse.setPageTotal(page.getTotalPages());
        return hdCasesResponse;
    }
}
