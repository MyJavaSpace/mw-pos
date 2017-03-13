package com.pos.dao;

import com.pos.entity.Useroperationlog;

public interface UseroperationlogMapper {
    int deleteByPrimaryKey(String id);

    int insert(Useroperationlog record);

    int insertSelective(Useroperationlog record);

    Useroperationlog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Useroperationlog record);

    int updateByPrimaryKey(Useroperationlog record);
}