package com.dute.officialNetwork.domain.repository;

import com.dute.officialNetwork.domain.entity.DecorationNav;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zhanghongwei on 2018/6/25.
 */
public interface DecortionNavRespository extends JpaRepository<DecorationNav, Long> {
    List<DecorationNav> findAllByTabShowOrderByTabOrderAsc(int tabShow);
}
