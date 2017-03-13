package com.pos.dao;

import com.pos.entity.Tbmtable;
import com.pos.entity.TbmtableKey;

public interface TbmtableMapper {
    int deleteByPrimaryKey(TbmtableKey key);

    int insert(Tbmtable record);

    int insertSelective(Tbmtable record);

    Tbmtable selectByPrimaryKey(TbmtableKey key);

    int updateByPrimaryKeySelective(Tbmtable record);

    int updateByPrimaryKey(Tbmtable record);
}