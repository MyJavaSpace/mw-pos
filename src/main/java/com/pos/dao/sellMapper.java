package com.pos.dao;

import com.pos.entity.sell;
import com.pos.entity.sellKey;

public interface sellMapper {
    int deleteByPrimaryKey(sellKey key);

    int insert(sell record);

    int insertSelective(sell record);

    sell selectByPrimaryKey(sellKey key);

    int updateByPrimaryKeySelective(sell record);

    int updateByPrimaryKey(sell record);
}