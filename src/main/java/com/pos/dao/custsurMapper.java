package com.pos.dao;

import com.pos.entity.custsur;
import com.pos.entity.custsurKey;

public interface custsurMapper {
    int deleteByPrimaryKey(custsurKey key);

    int insert(custsur record);

    int insertSelective(custsur record);

    custsur selectByPrimaryKey(custsurKey key);

    int updateByPrimaryKeySelective(custsur record);

    int updateByPrimaryKey(custsur record);
}