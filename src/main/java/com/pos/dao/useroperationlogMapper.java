package com.pos.dao;

import com.pos.entity.useroperationlog;

public interface useroperationlogMapper {
    int deleteByPrimaryKey(String id);

    int insert(useroperationlog record);

    int insertSelective(useroperationlog record);

    useroperationlog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(useroperationlog record);

    int updateByPrimaryKey(useroperationlog record);
}