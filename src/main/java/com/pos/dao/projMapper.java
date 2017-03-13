package com.pos.dao;

import com.pos.entity.Proj;

public interface ProjMapper {
    int deleteByPrimaryKey(String fsprojid);

    int insert(Proj record);

    int insertSelective(Proj record);

    Proj selectByPrimaryKey(String fsprojid);

    int updateByPrimaryKeySelective(Proj record);

    int updateByPrimaryKey(Proj record);
}