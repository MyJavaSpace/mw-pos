package com.pos.dao;

import com.pos.entity.Sellorderitem;
import com.pos.entity.SellorderitemKey;
import com.pos.entity.SellorderitemWithBLOBs;

public interface SellorderitemMapper {
    int deleteByPrimaryKey(SellorderitemKey key);

    int insert(SellorderitemWithBLOBs record);

    int insertSelective(SellorderitemWithBLOBs record);

    SellorderitemWithBLOBs selectByPrimaryKey(SellorderitemKey key);

    int updateByPrimaryKeySelective(SellorderitemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SellorderitemWithBLOBs record);

    int updateByPrimaryKey(Sellorderitem record);
}