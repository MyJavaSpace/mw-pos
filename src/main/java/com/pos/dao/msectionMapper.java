package com.pos.dao;

import com.pos.entity.Msection;
import com.pos.entity.MsectionKey;

public interface MsectionMapper {
    int deleteByPrimaryKey(MsectionKey key);

    int insert(Msection record);

    int insertSelective(Msection record);

    Msection selectByPrimaryKey(MsectionKey key);

    int updateByPrimaryKeySelective(Msection record);

    int updateByPrimaryKey(Msection record);
}