package com.pos.dao;

import com.pos.entity.sellhurryitem;
import com.pos.entity.sellhurryitemKey;

public interface sellhurryitemMapper {
    int deleteByPrimaryKey(sellhurryitemKey key);

    int insert(sellhurryitem record);

    int insertSelective(sellhurryitem record);

    sellhurryitem selectByPrimaryKey(sellhurryitemKey key);

    int updateByPrimaryKeySelective(sellhurryitem record);

    int updateByPrimaryKey(sellhurryitem record);
}