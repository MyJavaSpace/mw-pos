package com.pos.dao;

import com.pos.entity.Sellcheck;
import com.pos.entity.SellcheckKey;

public interface SellcheckMapper {
    int deleteByPrimaryKey(SellcheckKey key);

    int insert(Sellcheck record);

    int insertSelective(Sellcheck record);

    Sellcheck selectByPrimaryKey(SellcheckKey key);

    int updateByPrimaryKeySelective(Sellcheck record);

    int updateByPrimaryKey(Sellcheck record);
}