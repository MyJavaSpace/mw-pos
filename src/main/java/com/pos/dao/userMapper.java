package com.pos.dao;

import com.pos.entity.user;
import com.pos.entity.userKey;

public interface userMapper {
    int deleteByPrimaryKey(userKey key);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(userKey key);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}