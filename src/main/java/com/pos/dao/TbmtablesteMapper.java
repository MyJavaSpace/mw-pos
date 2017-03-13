package com.pos.dao;

import com.pos.entity.Tbmtableste;
import com.pos.entity.TbmtablesteKey;

public interface TbmtablesteMapper {
    int deleteByPrimaryKey(TbmtablesteKey key);

    int insert(Tbmtableste record);

    int insertSelective(Tbmtableste record);

    Tbmtableste selectByPrimaryKey(TbmtablesteKey key);

    int updateByPrimaryKeySelective(Tbmtableste record);

    int updateByPrimaryKey(Tbmtableste record);
}