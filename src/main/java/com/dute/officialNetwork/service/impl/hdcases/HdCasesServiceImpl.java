package com.dute.officialNetwork.service.impl.hdcases;

import com.dute.officialNetwork.api.po.HdCasesPo;
import com.dute.officialNetwork.api.request.hdcases.HdCasesRequest;
import com.dute.officialNetwork.domain.entity.HdCases;
import com.dute.officialNetwork.domain.repository.hdcases.HdCasesRepository;
import com.dute.officialNetwork.service.interfaces.hdcases.IHdCasesService;
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
    public List<HdCasesPo> findByRequest(HdCasesRequest hdCasesRequest) {
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
                if(hdCasesRequest.getStyle() != null && !"".equals(hdCasesRequest.getStyle())){
                    predicates.add(criteriaBuilder.like(hdCasesStyle,hdCasesRequest.getStyle()));
                }
                if(hdCasesRequest.getSize() != null && !"".equals(hdCasesRequest.getSize())){
                    predicates.add(criteriaBuilder.like(hdCasesSize,hdCasesRequest.getSize()));
                }
                if(hdCasesRequest.getAreas() != null && !"".equals(hdCasesRequest.getAreas())){
                    String areas = hdCasesRequest.getAreas();
                    areas = areas.substring(0,areas.lastIndexOf("0")+1);
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
        return list;
    }
}
