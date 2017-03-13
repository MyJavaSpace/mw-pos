package com.pos.dao;

import com.pos.entity.deliverer;
import com.pos.entity.delivererKey;

public interface delivererMapper {
    int deleteByPrimaryKey(delivererKey key);

    int insert(deliverer record);

    int insertSelective(deliverer record);

    deliverer selectByPrimaryKey(delivererKey key);

    int updateByPrimaryKeySelective(deliverer record);

    int updateByPrimaryKey(deliverer record);
}