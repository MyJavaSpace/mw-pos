package com.pos.dao;

import com.pos.entity.Publish;
import com.pos.entity.PublishKey;

public interface PublishMapper {
    int deleteByPrimaryKey(PublishKey key);

    int insert(Publish record);

    int insertSelective(Publish record);

    Publish selectByPrimaryKey(PublishKey key);

    int updateByPrimaryKeySelective(Publish record);

    int updateByPrimaryKey(Publish record);
}