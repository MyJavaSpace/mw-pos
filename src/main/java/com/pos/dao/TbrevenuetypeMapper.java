package com.pos.dao;

import com.pos.entity.Tbrevenuetype;
import com.pos.entity.TbrevenuetypeKey;

public interface TbrevenuetypeMapper {
    int deleteByPrimaryKey(TbrevenuetypeKey key);

    int insert(Tbrevenuetype record);

    int insertSelective(Tbrevenuetype record);

    Tbrevenuetype selectByPrimaryKey(TbrevenuetypeKey key);

    int updateByPrimaryKeySelective(Tbrevenuetype record);

    int updateByPrimaryKey(Tbrevenuetype record);
}