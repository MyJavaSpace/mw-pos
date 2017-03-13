package com.pos.dao;

import com.pos.entity.discountitem;
import com.pos.entity.discountitemKey;

public interface discountitemMapper {
    int deleteByPrimaryKey(discountitemKey key);

    int insert(discountitem record);

    int insertSelective(discountitem record);

    discountitem selectByPrimaryKey(discountitemKey key);

    int updateByPrimaryKeySelective(discountitem record);

    int updateByPrimaryKey(discountitem record);
}