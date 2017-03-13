package com.pos.dao;

import com.pos.entity.Authority;
import com.pos.entity.AuthorityKey;

public interface AuthorityMapper {
    int deleteByPrimaryKey(AuthorityKey key);

    int insert(Authority record);

    int insertSelective(Authority record);

    Authority selectByPrimaryKey(AuthorityKey key);

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);
}