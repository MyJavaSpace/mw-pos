package com.pos.dao;

import com.pos.entity.proj;

public interface projMapper {
    int deleteByPrimaryKey(String fsprojid);

    int insert(proj record);

    int insertSelective(proj record);

    proj selectByPrimaryKey(String fsprojid);

    int updateByPrimaryKeySelective(proj record);

    int updateByPrimaryKey(proj record);
}