package com.pos.dao;

import com.pos.entity.Payment;
import com.pos.entity.PaymentKey;

public interface PaymentMapper {
    int deleteByPrimaryKey(PaymentKey key);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(PaymentKey key);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}