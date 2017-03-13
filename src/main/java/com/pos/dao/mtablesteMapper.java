package com.pos.dao;

import com.pos.entity.Mtableste;
import com.pos.entity.MtablesteKey;

public interface MtablesteMapper {
    int deleteByPrimaryKey(MtablesteKey key);

    int insert(Mtableste record);

    int insertSelective(Mtableste record);

    Mtableste selectByPrimaryKey(MtablesteKey key);

    int updateByPrimaryKeySelective(Mtableste record);

    int updateByPrimaryKey(Mtableste record);
}