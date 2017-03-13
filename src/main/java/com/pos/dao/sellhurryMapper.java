package com.pos.dao;

import com.pos.entity.Sellhurry;
import com.pos.entity.SellhurryKey;

public interface SellhurryMapper {
    int deleteByPrimaryKey(SellhurryKey key);

    int insert(Sellhurry record);

    int insertSelective(Sellhurry record);

    Sellhurry selectByPrimaryKey(SellhurryKey key);

    int updateByPrimaryKeySelective(Sellhurry record);

    int updateByPrimaryKey(Sellhurry record);
}