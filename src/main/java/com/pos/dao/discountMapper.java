package com.pos.dao;

import com.pos.entity.discount;
import com.pos.entity.discountKey;

public interface discountMapper {
    int deleteByPrimaryKey(discountKey key);

    int insert(discount record);

    int insertSelective(discount record);

    discount selectByPrimaryKey(discountKey key);

    int updateByPrimaryKeySelective(discount record);

    int updateByPrimaryKey(discount record);
}