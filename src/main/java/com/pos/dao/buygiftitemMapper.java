package com.pos.dao;

import com.pos.entity.buygiftitem;
import com.pos.entity.buygiftitemKey;

public interface buygiftitemMapper {
    int deleteByPrimaryKey(buygiftitemKey key);

    int insert(buygiftitem record);

    int insertSelective(buygiftitem record);

    buygiftitem selectByPrimaryKey(buygiftitemKey key);

    int updateByPrimaryKeySelective(buygiftitem record);

    int updateByPrimaryKey(buygiftitem record);
}