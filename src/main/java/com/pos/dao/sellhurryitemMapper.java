package com.pos.dao;

import com.pos.entity.Sellhurryitem;
import com.pos.entity.SellhurryitemKey;

public interface SellhurryitemMapper {
    int deleteByPrimaryKey(SellhurryitemKey key);

    int insert(Sellhurryitem record);

    int insertSelective(Sellhurryitem record);

    Sellhurryitem selectByPrimaryKey(SellhurryitemKey key);

    int updateByPrimaryKeySelective(Sellhurryitem record);

    int updateByPrimaryKey(Sellhurryitem record);
}