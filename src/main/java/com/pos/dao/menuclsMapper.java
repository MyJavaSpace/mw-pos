package com.pos.dao;

import com.pos.entity.menucls;
import com.pos.entity.menuclsKey;

public interface menuclsMapper {
    int deleteByPrimaryKey(menuclsKey key);

    int insert(menucls record);

    int insertSelective(menucls record);

    menucls selectByPrimaryKey(menuclsKey key);

    int updateByPrimaryKeySelective(menucls record);

    int updateByPrimaryKey(menucls record);
}