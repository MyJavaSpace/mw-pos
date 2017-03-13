package com.pos.dao;

import com.pos.entity.paramvalue;
import com.pos.entity.paramvalueKey;

public interface paramvalueMapper {
    int deleteByPrimaryKey(paramvalueKey key);

    int insert(paramvalue record);

    int insertSelective(paramvalue record);

    paramvalue selectByPrimaryKey(paramvalueKey key);

    int updateByPrimaryKeySelective(paramvalue record);

    int updateByPrimaryKey(paramvalue record);
}