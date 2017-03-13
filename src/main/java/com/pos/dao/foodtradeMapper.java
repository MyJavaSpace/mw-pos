package com.pos.dao;

import com.pos.entity.Foodtrade;

public interface FoodtradeMapper {
    int deleteByPrimaryKey(String fsfoodtradeid);

    int insert(Foodtrade record);

    int insertSelective(Foodtrade record);

    Foodtrade selectByPrimaryKey(String fsfoodtradeid);

    int updateByPrimaryKeySelective(Foodtrade record);

    int updateByPrimaryKey(Foodtrade record);
}