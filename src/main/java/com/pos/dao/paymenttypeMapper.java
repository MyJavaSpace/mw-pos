package com.pos.dao;

import com.pos.entity.Paymenttype;
import com.pos.entity.PaymenttypeKey;

public interface PaymenttypeMapper {
    int deleteByPrimaryKey(PaymenttypeKey key);

    int insert(Paymenttype record);

    int insertSelective(Paymenttype record);

    Paymenttype selectByPrimaryKey(PaymenttypeKey key);

    int updateByPrimaryKeySelective(Paymenttype record);

    int updateByPrimaryKey(Paymenttype record);
}