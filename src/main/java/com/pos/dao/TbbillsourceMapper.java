package com.pos.dao;

import com.pos.entity.Tbbillsource;
import com.pos.entity.TbbillsourceKey;

public interface TbbillsourceMapper {
    int deleteByPrimaryKey(TbbillsourceKey key);

    int insert(Tbbillsource record);

    int insertSelective(Tbbillsource record);

    Tbbillsource selectByPrimaryKey(TbbillsourceKey key);

    int updateByPrimaryKeySelective(Tbbillsource record);

    int updateByPrimaryKey(Tbbillsource record);
}