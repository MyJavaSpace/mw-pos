package com.pos.dao;

import com.pos.entity.custste;
import com.pos.entity.custsteKey;

public interface custsteMapper {
    int deleteByPrimaryKey(custsteKey key);

    int insert(custste record);

    int insertSelective(custste record);

    custste selectByPrimaryKey(custsteKey key);

    int updateByPrimaryKeySelective(custste record);

    int updateByPrimaryKey(custste record);
}