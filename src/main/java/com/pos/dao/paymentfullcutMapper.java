package com.pos.dao;

import com.pos.entity.Paymentfullcut;
import com.pos.entity.PaymentfullcutKey;

public interface PaymentfullcutMapper {
    int deleteByPrimaryKey(PaymentfullcutKey key);

    int insert(Paymentfullcut record);

    int insertSelective(Paymentfullcut record);

    Paymentfullcut selectByPrimaryKey(PaymentfullcutKey key);

    int updateByPrimaryKeySelective(Paymentfullcut record);

    int updateByPrimaryKey(Paymentfullcut record);
}