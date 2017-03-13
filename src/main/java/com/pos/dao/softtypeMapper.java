package com.pos.dao;

import com.pos.entity.softtype;
import com.pos.entity.softtypeKey;

public interface softtypeMapper {
    int deleteByPrimaryKey(softtypeKey key);

    int insert(softtype record);

    int insertSelective(softtype record);

    softtype selectByPrimaryKey(softtypeKey key);

    int updateByPrimaryKeySelective(softtype record);

    int updateByPrimaryKey(softtype record);
}