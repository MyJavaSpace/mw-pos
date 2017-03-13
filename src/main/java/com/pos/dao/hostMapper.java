package com.pos.dao;

import com.pos.entity.host;
import com.pos.entity.hostKey;

public interface hostMapper {
    int deleteByPrimaryKey(hostKey key);

    int insert(host record);

    int insertSelective(host record);

    host selectByPrimaryKey(hostKey key);

    int updateByPrimaryKeySelective(host record);

    int updateByPrimaryKey(host record);
}