package com.pos.dao;

import com.pos.entity.payment;
import com.pos.entity.paymentKey;

public interface paymentMapper {
    int deleteByPrimaryKey(paymentKey key);

    int insert(payment record);

    int insertSelective(payment record);

    payment selectByPrimaryKey(paymentKey key);

    int updateByPrimaryKeySelective(payment record);

    int updateByPrimaryKey(payment record);
}