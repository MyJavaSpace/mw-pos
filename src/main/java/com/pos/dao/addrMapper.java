package com.pos.dao;

import com.pos.entity.Addr;
import com.pos.entity.AddrKey;

public interface AddrMapper {
    int deleteByPrimaryKey(AddrKey key);

    int insert(Addr record);

    int insertSelective(Addr record);

    Addr selectByPrimaryKey(AddrKey key);

    int updateByPrimaryKeySelective(Addr record);

    int updateByPrimaryKey(Addr record);
}