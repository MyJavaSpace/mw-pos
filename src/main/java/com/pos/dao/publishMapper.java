package com.pos.dao;

import com.pos.entity.publish;
import com.pos.entity.publishKey;

public interface publishMapper {
    int deleteByPrimaryKey(publishKey key);

    int insert(publish record);

    int insertSelective(publish record);

    publish selectByPrimaryKey(publishKey key);

    int updateByPrimaryKeySelective(publish record);

    int updateByPrimaryKey(publish record);
}