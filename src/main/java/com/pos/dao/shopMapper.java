package com.pos.dao;

import com.pos.entity.Shop;

public interface ShopMapper {
    int deleteByPrimaryKey(String fsshopguid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(String fsshopguid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}