package com.pos.dao;

import com.pos.entity.Menuitemsetside;
import com.pos.entity.MenuitemsetsideKey;

public interface MenuitemsetsideMapper {
    int deleteByPrimaryKey(MenuitemsetsideKey key);

    int insert(Menuitemsetside record);

    int insertSelective(Menuitemsetside record);

    Menuitemsetside selectByPrimaryKey(MenuitemsetsideKey key);

    int updateByPrimaryKeySelective(Menuitemsetside record);

    int updateByPrimaryKey(Menuitemsetside record);
}