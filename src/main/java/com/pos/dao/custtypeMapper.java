package com.pos.dao;

import com.pos.entity.custtype;
import com.pos.entity.custtypeKey;

public interface custtypeMapper {
    int deleteByPrimaryKey(custtypeKey key);

    int insert(custtype record);

    int insertSelective(custtype record);

    custtype selectByPrimaryKey(custtypeKey key);

    int updateByPrimaryKeySelective(custtype record);

    int updateByPrimaryKey(custtype record);
}