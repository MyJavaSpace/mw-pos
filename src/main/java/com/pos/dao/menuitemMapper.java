package com.pos.dao;

import com.pos.entity.menuitem;
import com.pos.entity.menuitemKey;

public interface menuitemMapper {
    int deleteByPrimaryKey(menuitemKey key);

    int insert(menuitem record);

    int insertSelective(menuitem record);

    menuitem selectByPrimaryKey(menuitemKey key);

    int updateByPrimaryKeySelective(menuitem record);

    int updateByPrimaryKey(menuitem record);
}