package com.pos.dao;

import com.pos.entity.Menuitem;
import com.pos.entity.MenuitemKey;

public interface MenuitemMapper {
    int deleteByPrimaryKey(MenuitemKey key);

    int insert(Menuitem record);

    int insertSelective(Menuitem record);

    Menuitem selectByPrimaryKey(MenuitemKey key);

    int updateByPrimaryKeySelective(Menuitem record);

    int updateByPrimaryKey(Menuitem record);
}