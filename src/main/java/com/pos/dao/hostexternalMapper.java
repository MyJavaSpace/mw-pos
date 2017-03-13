package com.pos.dao;

import com.pos.entity.Hostexternal;
import com.pos.entity.HostexternalKey;

public interface HostexternalMapper {
    int deleteByPrimaryKey(HostexternalKey key);

    int insert(Hostexternal record);

    int insertSelective(Hostexternal record);

    Hostexternal selectByPrimaryKey(HostexternalKey key);

    int updateByPrimaryKeySelective(Hostexternal record);

    int updateByPrimaryKeyWithBLOBs(Hostexternal record);

    int updateByPrimaryKey(Hostexternal record);
}