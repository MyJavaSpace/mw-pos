package com.pos.dao;

import com.pos.entity.foodtrade;

public interface foodtradeMapper {
    int deleteByPrimaryKey(String fsfoodtradeid);

    int insert(foodtrade record);

    int insertSelective(foodtrade record);

    foodtrade selectByPrimaryKey(String fsfoodtradeid);

    int updateByPrimaryKeySelective(foodtrade record);

    int updateByPrimaryKey(foodtrade record);
}