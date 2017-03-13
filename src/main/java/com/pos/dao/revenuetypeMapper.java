package com.pos.dao;

import com.pos.entity.Revenuetype;
import com.pos.entity.RevenuetypeKey;

public interface RevenuetypeMapper {
    int deleteByPrimaryKey(RevenuetypeKey key);

    int insert(Revenuetype record);

    int insertSelective(Revenuetype record);

    Revenuetype selectByPrimaryKey(RevenuetypeKey key);

    int updateByPrimaryKeySelective(Revenuetype record);

    int updateByPrimaryKey(Revenuetype record);
}