package com.pos.dao;

import com.pos.entity.Param;

public interface ParamMapper {
    int deleteByPrimaryKey(String fsparamid);

    int insert(Param record);

    int insertSelective(Param record);

    Param selectByPrimaryKey(String fsparamid);

    int updateByPrimaryKeySelective(Param record);

    int updateByPrimaryKey(Param record);
}