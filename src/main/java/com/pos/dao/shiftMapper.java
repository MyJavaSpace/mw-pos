package com.pos.dao;

import com.pos.entity.Shift;
import com.pos.entity.ShiftKey;

public interface ShiftMapper {
    int deleteByPrimaryKey(ShiftKey key);

    int insert(Shift record);

    int insertSelective(Shift record);

    Shift selectByPrimaryKey(ShiftKey key);

    int updateByPrimaryKeySelective(Shift record);

    int updateByPrimaryKey(Shift record);
}