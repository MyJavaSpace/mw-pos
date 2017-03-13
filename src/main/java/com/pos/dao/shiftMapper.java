package com.pos.dao;

import com.pos.entity.shift;
import com.pos.entity.shiftKey;

public interface shiftMapper {
    int deleteByPrimaryKey(shiftKey key);

    int insert(shift record);

    int insertSelective(shift record);

    shift selectByPrimaryKey(shiftKey key);

    int updateByPrimaryKeySelective(shift record);

    int updateByPrimaryKey(shift record);
}