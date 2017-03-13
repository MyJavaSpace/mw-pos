package com.pos.dao;

import com.pos.entity.sellorderitem;
import com.pos.entity.sellorderitemKey;
import com.pos.entity.sellorderitemWithBLOBs;

public interface sellorderitemMapper {
    int deleteByPrimaryKey(sellorderitemKey key);

    int insert(sellorderitemWithBLOBs record);

    int insertSelective(sellorderitemWithBLOBs record);

    sellorderitemWithBLOBs selectByPrimaryKey(sellorderitemKey key);

    int updateByPrimaryKeySelective(sellorderitemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(sellorderitemWithBLOBs record);

    int updateByPrimaryKey(sellorderitem record);
}