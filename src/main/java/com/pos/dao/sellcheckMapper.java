package com.pos.dao;

import com.pos.entity.sellcheck;
import com.pos.entity.sellcheckKey;

public interface sellcheckMapper {
    int deleteByPrimaryKey(sellcheckKey key);

    int insert(sellcheck record);

    int insertSelective(sellcheck record);

    sellcheck selectByPrimaryKey(sellcheckKey key);

    int updateByPrimaryKeySelective(sellcheck record);

    int updateByPrimaryKey(sellcheck record);
}