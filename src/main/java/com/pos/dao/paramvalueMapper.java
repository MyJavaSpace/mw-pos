package com.pos.dao;

import com.pos.entity.Paramvalue;
import com.pos.entity.ParamvalueKey;

public interface ParamvalueMapper {
    int deleteByPrimaryKey(ParamvalueKey key);

    int insert(Paramvalue record);

    int insertSelective(Paramvalue record);

    Paramvalue selectByPrimaryKey(ParamvalueKey key);

    int updateByPrimaryKeySelective(Paramvalue record);

    int updateByPrimaryKey(Paramvalue record);
}