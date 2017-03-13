package com.pos.dao;

import com.pos.entity.Menuingredientgp;
import com.pos.entity.MenuingredientgpKey;

public interface MenuingredientgpMapper {
    int deleteByPrimaryKey(MenuingredientgpKey key);

    int insert(Menuingredientgp record);

    int insertSelective(Menuingredientgp record);

    Menuingredientgp selectByPrimaryKey(MenuingredientgpKey key);

    int updateByPrimaryKeySelective(Menuingredientgp record);

    int updateByPrimaryKey(Menuingredientgp record);
}