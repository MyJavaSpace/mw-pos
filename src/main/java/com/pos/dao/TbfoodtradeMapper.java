package com.pos.dao;

import com.pos.entity.Tbfoodtrade;

public interface TbfoodtradeMapper {
    int deleteByPrimaryKey(String fsFoodTradeId);

    int insert(Tbfoodtrade record);

    int insertSelective(Tbfoodtrade record);

    Tbfoodtrade selectByPrimaryKey(String fsFoodTradeId);

    int updateByPrimaryKeySelective(Tbfoodtrade record);

    int updateByPrimaryKey(Tbfoodtrade record);
}