package com.pos.dao;

import com.pos.entity.Hostver;
import com.pos.entity.HostverKey;

public interface HostverMapper {
    int deleteByPrimaryKey(HostverKey key);

    int insert(Hostver record);

    int insertSelective(Hostver record);

    Hostver selectByPrimaryKey(HostverKey key);

    int updateByPrimaryKeySelective(Hostver record);

    int updateByPrimaryKey(Hostver record);
}