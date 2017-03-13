package com.pos.dao;

import com.pos.entity.msection;
import com.pos.entity.msectionKey;

public interface msectionMapper {
    int deleteByPrimaryKey(msectionKey key);

    int insert(msection record);

    int insertSelective(msection record);

    msection selectByPrimaryKey(msectionKey key);

    int updateByPrimaryKeySelective(msection record);

    int updateByPrimaryKey(msection record);
}