package com.pos.dao;

import com.pos.entity.paymentfullcut;
import com.pos.entity.paymentfullcutKey;

public interface paymentfullcutMapper {
    int deleteByPrimaryKey(paymentfullcutKey key);

    int insert(paymentfullcut record);

    int insertSelective(paymentfullcut record);

    paymentfullcut selectByPrimaryKey(paymentfullcutKey key);

    int updateByPrimaryKeySelective(paymentfullcut record);

    int updateByPrimaryKey(paymentfullcut record);
}