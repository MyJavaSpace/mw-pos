package com.pos.dao;

import com.pos.entity.Buygiftitem;
import com.pos.entity.BuygiftitemKey;

public interface BuygiftitemMapper {
    int deleteByPrimaryKey(BuygiftitemKey key);

    int insert(Buygiftitem record);

    int insertSelective(Buygiftitem record);

    Buygiftitem selectByPrimaryKey(BuygiftitemKey key);

    int updateByPrimaryKeySelective(Buygiftitem record);

    int updateByPrimaryKey(Buygiftitem record);
}