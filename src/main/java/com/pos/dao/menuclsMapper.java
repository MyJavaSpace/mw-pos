package com.pos.dao;

import com.pos.entity.Menucls;
import com.pos.entity.MenuclsKey;

public interface MenuclsMapper {
    int deleteByPrimaryKey(MenuclsKey key);

    int insert(Menucls record);

    int insertSelective(Menucls record);

    Menucls selectByPrimaryKey(MenuclsKey key);

    int updateByPrimaryKeySelective(Menucls record);

    int updateByPrimaryKey(Menucls record);
}