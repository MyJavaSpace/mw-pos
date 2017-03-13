package com.pos.dao;

import com.pos.entity.Tbprogdtl;
import com.pos.entity.TbprogdtlKey;

public interface TbprogdtlMapper {
    int deleteByPrimaryKey(TbprogdtlKey key);

    int insert(Tbprogdtl record);

    int insertSelective(Tbprogdtl record);

    Tbprogdtl selectByPrimaryKey(TbprogdtlKey key);

    int updateByPrimaryKeySelective(Tbprogdtl record);

    int updateByPrimaryKey(Tbprogdtl record);
}