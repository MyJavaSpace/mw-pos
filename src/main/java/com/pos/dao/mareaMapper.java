package com.pos.dao;

import com.pos.entity.marea;
import com.pos.entity.mareaKey;

public interface mareaMapper {
    int deleteByPrimaryKey(mareaKey key);

    int insert(marea record);

    int insertSelective(marea record);

    marea selectByPrimaryKey(mareaKey key);

    int updateByPrimaryKeySelective(marea record);

    int updateByPrimaryKey(marea record);
}