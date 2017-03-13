package com.pos.dao;

import com.pos.entity.Sell;
import com.pos.entity.SellKey;

public interface SellMapper {
    int deleteByPrimaryKey(SellKey key);

    int insert(Sell record);

    int insertSelective(Sell record);

    Sell selectByPrimaryKey(SellKey key);

    int updateByPrimaryKeySelective(Sell record);

    int updateByPrimaryKey(Sell record);
}