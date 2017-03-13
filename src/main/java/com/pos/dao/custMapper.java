package com.pos.dao;

import com.pos.entity.cust;

public interface custMapper {
    int deleteByPrimaryKey(String fscustguid);

    int insert(cust record);

    int insertSelective(cust record);

    cust selectByPrimaryKey(String fscustguid);

    int updateByPrimaryKeySelective(cust record);

    int updateByPrimaryKey(cust record);
}