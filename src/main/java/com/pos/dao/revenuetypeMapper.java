package com.pos.dao;

import com.pos.entity.revenuetype;
import com.pos.entity.revenuetypeKey;

public interface revenuetypeMapper {
    int deleteByPrimaryKey(revenuetypeKey key);

    int insert(revenuetype record);

    int insertSelective(revenuetype record);

    revenuetype selectByPrimaryKey(revenuetypeKey key);

    int updateByPrimaryKeySelective(revenuetype record);

    int updateByPrimaryKey(revenuetype record);
}