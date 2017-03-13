package com.pos.dao;

import com.pos.entity.Tbrole;
import com.pos.entity.TbroleKey;

public interface TbroleMapper {
    int deleteByPrimaryKey(TbroleKey key);

    int insert(Tbrole record);

    int insertSelective(Tbrole record);

    Tbrole selectByPrimaryKey(TbroleKey key);

    int updateByPrimaryKeySelective(Tbrole record);

    int updateByPrimaryKey(Tbrole record);
}