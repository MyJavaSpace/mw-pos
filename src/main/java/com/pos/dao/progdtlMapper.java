package com.pos.dao;

import com.pos.entity.Progdtl;
import com.pos.entity.ProgdtlKey;

public interface ProgdtlMapper {
    int deleteByPrimaryKey(ProgdtlKey key);

    int insert(Progdtl record);

    int insertSelective(Progdtl record);

    Progdtl selectByPrimaryKey(ProgdtlKey key);

    int updateByPrimaryKeySelective(Progdtl record);

    int updateByPrimaryKey(Progdtl record);
}