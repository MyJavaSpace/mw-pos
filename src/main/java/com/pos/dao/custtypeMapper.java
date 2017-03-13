package com.pos.dao;

import com.pos.entity.Custtype;
import com.pos.entity.CusttypeKey;

public interface CusttypeMapper {
    int deleteByPrimaryKey(CusttypeKey key);

    int insert(Custtype record);

    int insertSelective(Custtype record);

    Custtype selectByPrimaryKey(CusttypeKey key);

    int updateByPrimaryKeySelective(Custtype record);

    int updateByPrimaryKey(Custtype record);
}