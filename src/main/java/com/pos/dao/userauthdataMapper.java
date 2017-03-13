package com.pos.dao;

import com.pos.entity.Userauthdata;
import com.pos.entity.UserauthdataKey;

public interface UserauthdataMapper {
    int deleteByPrimaryKey(UserauthdataKey key);

    int insert(Userauthdata record);

    int insertSelective(Userauthdata record);

    Userauthdata selectByPrimaryKey(UserauthdataKey key);

    int updateByPrimaryKeySelective(Userauthdata record);

    int updateByPrimaryKey(Userauthdata record);
}