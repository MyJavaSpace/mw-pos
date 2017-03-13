package com.pos.dao;

import com.pos.entity.Discountitem;
import com.pos.entity.DiscountitemKey;

public interface DiscountitemMapper {
    int deleteByPrimaryKey(DiscountitemKey key);

    int insert(Discountitem record);

    int insertSelective(Discountitem record);

    Discountitem selectByPrimaryKey(DiscountitemKey key);

    int updateByPrimaryKeySelective(Discountitem record);

    int updateByPrimaryKey(Discountitem record);
}