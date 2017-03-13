package com.pos.dao;

import com.pos.entity.Prog;

public interface ProgMapper {
    int deleteByPrimaryKey(String fsprogid);

    int insert(Prog record);

    int insertSelective(Prog record);

    Prog selectByPrimaryKey(String fsprogid);

    int updateByPrimaryKeySelective(Prog record);

    int updateByPrimaryKey(Prog record);
}