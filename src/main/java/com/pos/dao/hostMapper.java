package com.pos.dao;

import com.pos.entity.Host;
import com.pos.entity.HostKey;

public interface HostMapper {
    int deleteByPrimaryKey(HostKey key);

    int insert(Host record);

    int insertSelective(Host record);

    Host selectByPrimaryKey(HostKey key);

    int updateByPrimaryKeySelective(Host record);

    int updateByPrimaryKey(Host record);
}