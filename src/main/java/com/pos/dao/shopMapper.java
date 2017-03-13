package com.pos.dao;

import com.pos.entity.shop;

public interface shopMapper {
    int deleteByPrimaryKey(String fsshopguid);

    int insert(shop record);

    int insertSelective(shop record);

    shop selectByPrimaryKey(String fsshopguid);

    int updateByPrimaryKeySelective(shop record);

    int updateByPrimaryKey(shop record);
}