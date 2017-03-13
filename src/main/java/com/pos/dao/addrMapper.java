package com.pos.dao;

import com.pos.entity.addr;
import com.pos.entity.addrKey;

public interface addrMapper {
    int deleteByPrimaryKey(addrKey key);

    int insert(addr record);

    int insertSelective(addr record);

    addr selectByPrimaryKey(addrKey key);

    int updateByPrimaryKeySelective(addr record);

    int updateByPrimaryKey(addr record);
}