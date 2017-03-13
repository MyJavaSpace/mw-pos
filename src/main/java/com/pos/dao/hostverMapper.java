package com.pos.dao;

import com.pos.entity.hostver;
import com.pos.entity.hostverKey;

public interface hostverMapper {
    int deleteByPrimaryKey(hostverKey key);

    int insert(hostver record);

    int insertSelective(hostver record);

    hostver selectByPrimaryKey(hostverKey key);

    int updateByPrimaryKeySelective(hostver record);

    int updateByPrimaryKey(hostver record);
}