package com.pos.dao;

import com.pos.entity.menuitemsetside;
import com.pos.entity.menuitemsetsideKey;

public interface menuitemsetsideMapper {
    int deleteByPrimaryKey(menuitemsetsideKey key);

    int insert(menuitemsetside record);

    int insertSelective(menuitemsetside record);

    menuitemsetside selectByPrimaryKey(menuitemsetsideKey key);

    int updateByPrimaryKeySelective(menuitemsetside record);

    int updateByPrimaryKey(menuitemsetside record);
}