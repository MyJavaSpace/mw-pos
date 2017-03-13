package com.pos.dao;

import com.pos.entity.prog;

public interface progMapper {
    int deleteByPrimaryKey(String fsprogid);

    int insert(prog record);

    int insertSelective(prog record);

    prog selectByPrimaryKey(String fsprogid);

    int updateByPrimaryKeySelective(prog record);

    int updateByPrimaryKey(prog record);
}