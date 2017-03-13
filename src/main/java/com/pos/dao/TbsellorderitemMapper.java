package com.pos.dao;

import com.pos.entity.Tbsellorderitem;
import com.pos.entity.TbsellorderitemKey;
import com.pos.entity.TbsellorderitemWithBLOBs;

public interface TbsellorderitemMapper {
    int deleteByPrimaryKey(TbsellorderitemKey key);

    int insert(TbsellorderitemWithBLOBs record);

    int insertSelective(TbsellorderitemWithBLOBs record);

    TbsellorderitemWithBLOBs selectByPrimaryKey(TbsellorderitemKey key);

    int updateByPrimaryKeySelective(TbsellorderitemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbsellorderitemWithBLOBs record);

    int updateByPrimaryKey(Tbsellorderitem record);
}