package com.pos.dao;

import com.pos.entity.authoritydtl;
import com.pos.entity.authoritydtlKey;

public interface authoritydtlMapper {
    int deleteByPrimaryKey(authoritydtlKey key);

    int insert(authoritydtl record);

    int insertSelective(authoritydtl record);

    authoritydtl selectByPrimaryKey(authoritydtlKey key);

    int updateByPrimaryKeySelective(authoritydtl record);

    int updateByPrimaryKey(authoritydtl record);
}