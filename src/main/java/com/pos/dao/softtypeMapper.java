package com.pos.dao;

import com.pos.entity.Softtype;
import com.pos.entity.SofttypeKey;

public interface SofttypeMapper {
    int deleteByPrimaryKey(SofttypeKey key);

    int insert(Softtype record);

    int insertSelective(Softtype record);

    Softtype selectByPrimaryKey(SofttypeKey key);

    int updateByPrimaryKeySelective(Softtype record);

    int updateByPrimaryKey(Softtype record);
}