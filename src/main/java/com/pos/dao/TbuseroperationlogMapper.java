package com.pos.dao;

import com.pos.entity.Tbuseroperationlog;

public interface TbuseroperationlogMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tbuseroperationlog record);

    int insertSelective(Tbuseroperationlog record);

    Tbuseroperationlog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tbuseroperationlog record);

    int updateByPrimaryKey(Tbuseroperationlog record);
}