package com.pos.dao;

import com.pos.entity.Tbbuygiftitem;
import com.pos.entity.TbbuygiftitemKey;

public interface TbbuygiftitemMapper {
    int deleteByPrimaryKey(TbbuygiftitemKey key);

    int insert(Tbbuygiftitem record);

    int insertSelective(Tbbuygiftitem record);

    Tbbuygiftitem selectByPrimaryKey(TbbuygiftitemKey key);

    int updateByPrimaryKeySelective(Tbbuygiftitem record);

    int updateByPrimaryKey(Tbbuygiftitem record);
}