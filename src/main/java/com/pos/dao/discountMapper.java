package com.pos.dao;

import com.pos.entity.Discount;
import com.pos.entity.DiscountKey;

public interface DiscountMapper {
    int deleteByPrimaryKey(DiscountKey key);

    int insert(Discount record);

    int insertSelective(Discount record);

    Discount selectByPrimaryKey(DiscountKey key);

    int updateByPrimaryKeySelective(Discount record);

    int updateByPrimaryKey(Discount record);
}