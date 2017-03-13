package com.pos.dao;

import com.pos.entity.progdtl;
import com.pos.entity.progdtlKey;

public interface progdtlMapper {
    int deleteByPrimaryKey(progdtlKey key);

    int insert(progdtl record);

    int insertSelective(progdtl record);

    progdtl selectByPrimaryKey(progdtlKey key);

    int updateByPrimaryKeySelective(progdtl record);

    int updateByPrimaryKey(progdtl record);
}