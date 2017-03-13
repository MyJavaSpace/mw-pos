package com.pos.dao;

import com.pos.entity.mtable;
import com.pos.entity.mtableKey;

public interface mtableMapper {
    int deleteByPrimaryKey(mtableKey key);

    int insert(mtable record);

    int insertSelective(mtable record);

    mtable selectByPrimaryKey(mtableKey key);

    int updateByPrimaryKeySelective(mtable record);

    int updateByPrimaryKey(mtable record);
}