package com.pos.dao;

import com.pos.entity.Mtable;
import com.pos.entity.MtableKey;

public interface MtableMapper {
    int deleteByPrimaryKey(MtableKey key);

    int insert(Mtable record);

    int insertSelective(Mtable record);

    Mtable selectByPrimaryKey(MtableKey key);

    int updateByPrimaryKeySelective(Mtable record);

    int updateByPrimaryKey(Mtable record);
}