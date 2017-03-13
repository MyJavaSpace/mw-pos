package com.pos.dao;

import com.pos.entity.userauthdata;
import com.pos.entity.userauthdataKey;

public interface userauthdataMapper {
    int deleteByPrimaryKey(userauthdataKey key);

    int insert(userauthdata record);

    int insertSelective(userauthdata record);

    userauthdata selectByPrimaryKey(userauthdataKey key);

    int updateByPrimaryKeySelective(userauthdata record);

    int updateByPrimaryKey(userauthdata record);
}