package com.pos.dao;

import com.pos.entity.hostexternal;
import com.pos.entity.hostexternalKey;

public interface hostexternalMapper {
    int deleteByPrimaryKey(hostexternalKey key);

    int insert(hostexternal record);

    int insertSelective(hostexternal record);

    hostexternal selectByPrimaryKey(hostexternalKey key);

    int updateByPrimaryKeySelective(hostexternal record);

    int updateByPrimaryKeyWithBLOBs(hostexternal record);

    int updateByPrimaryKey(hostexternal record);
}