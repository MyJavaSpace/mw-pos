package com.pos.dao;

import com.pos.entity.sellhurry;
import com.pos.entity.sellhurryKey;

public interface sellhurryMapper {
    int deleteByPrimaryKey(sellhurryKey key);

    int insert(sellhurry record);

    int insertSelective(sellhurry record);

    sellhurry selectByPrimaryKey(sellhurryKey key);

    int updateByPrimaryKeySelective(sellhurry record);

    int updateByPrimaryKey(sellhurry record);
}