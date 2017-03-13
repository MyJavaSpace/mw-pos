package com.pos.dao;

import com.pos.entity.param;

public interface paramMapper {
    int deleteByPrimaryKey(String fsparamid);

    int insert(param record);

    int insertSelective(param record);

    param selectByPrimaryKey(String fsparamid);

    int updateByPrimaryKeySelective(param record);

    int updateByPrimaryKey(param record);
}