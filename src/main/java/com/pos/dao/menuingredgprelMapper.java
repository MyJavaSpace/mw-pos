package com.pos.dao;

import com.pos.entity.Menuingredgprel;
import com.pos.entity.MenuingredgprelKey;

public interface MenuingredgprelMapper {
    int deleteByPrimaryKey(MenuingredgprelKey key);

    int insert(Menuingredgprel record);

    int insertSelective(Menuingredgprel record);

    Menuingredgprel selectByPrimaryKey(MenuingredgprelKey key);

    int updateByPrimaryKeySelective(Menuingredgprel record);

    int updateByPrimaryKey(Menuingredgprel record);
}