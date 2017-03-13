package com.pos.dao;

import com.pos.entity.Tbshop;

public interface TbshopMapper {
    int deleteByPrimaryKey(String fsShopGUID);

    int insert(Tbshop record);

    int insertSelective(Tbshop record);

    Tbshop selectByPrimaryKey(String fsShopGUID);

    int updateByPrimaryKeySelective(Tbshop record);

    int updateByPrimaryKey(Tbshop record);
}