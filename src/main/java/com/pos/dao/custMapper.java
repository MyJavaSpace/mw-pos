package com.pos.dao;

import com.pos.entity.Cust;

public interface CustMapper {
    int deleteByPrimaryKey(String fscustguid);

    int insert(Cust record);

    int insertSelective(Cust record);

    Cust selectByPrimaryKey(String fscustguid);

    int updateByPrimaryKeySelective(Cust record);

    int updateByPrimaryKey(Cust record);
}