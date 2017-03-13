package com.pos.dao;

import com.pos.entity.application;
import com.pos.entity.applicationKey;

public interface applicationMapper {
    int deleteByPrimaryKey(applicationKey key);

    int insert(application record);

    int insertSelective(application record);

    application selectByPrimaryKey(applicationKey key);

    int updateByPrimaryKeySelective(application record);

    int updateByPrimaryKey(application record);
}