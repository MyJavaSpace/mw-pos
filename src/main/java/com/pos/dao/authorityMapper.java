package com.pos.dao;

import com.pos.entity.authority;
import com.pos.entity.authorityKey;

public interface authorityMapper {
    int deleteByPrimaryKey(authorityKey key);

    int insert(authority record);

    int insertSelective(authority record);

    authority selectByPrimaryKey(authorityKey key);

    int updateByPrimaryKeySelective(authority record);

    int updateByPrimaryKey(authority record);
}