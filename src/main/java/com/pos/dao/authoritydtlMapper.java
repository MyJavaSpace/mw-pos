package com.pos.dao;

import com.pos.entity.Authoritydtl;
import com.pos.entity.AuthoritydtlKey;

public interface AuthoritydtlMapper {
    int deleteByPrimaryKey(AuthoritydtlKey key);

    int insert(Authoritydtl record);

    int insertSelective(Authoritydtl record);

    Authoritydtl selectByPrimaryKey(AuthoritydtlKey key);

    int updateByPrimaryKeySelective(Authoritydtl record);

    int updateByPrimaryKey(Authoritydtl record);
}