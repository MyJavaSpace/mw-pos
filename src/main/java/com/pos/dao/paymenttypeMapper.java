package com.pos.dao;

import com.pos.entity.paymenttype;
import com.pos.entity.paymenttypeKey;

public interface paymenttypeMapper {
    int deleteByPrimaryKey(paymenttypeKey key);

    int insert(paymenttype record);

    int insertSelective(paymenttype record);

    paymenttype selectByPrimaryKey(paymenttypeKey key);

    int updateByPrimaryKeySelective(paymenttype record);

    int updateByPrimaryKey(paymenttype record);
}