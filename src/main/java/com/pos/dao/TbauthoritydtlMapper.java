package com.pos.dao;

import com.pos.entity.Tbauthoritydtl;
import com.pos.entity.TbauthoritydtlKey;

public interface TbauthoritydtlMapper {
    int deleteByPrimaryKey(TbauthoritydtlKey key);

    int insert(Tbauthoritydtl record);

    int insertSelective(Tbauthoritydtl record);

    Tbauthoritydtl selectByPrimaryKey(TbauthoritydtlKey key);

    int updateByPrimaryKeySelective(Tbauthoritydtl record);

    int updateByPrimaryKey(Tbauthoritydtl record);
}