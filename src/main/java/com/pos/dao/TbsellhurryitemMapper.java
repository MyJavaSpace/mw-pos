package com.pos.dao;

import com.pos.entity.Tbsellhurryitem;
import com.pos.entity.TbsellhurryitemKey;

public interface TbsellhurryitemMapper {
    int deleteByPrimaryKey(TbsellhurryitemKey key);

    int insert(Tbsellhurryitem record);

    int insertSelective(Tbsellhurryitem record);

    Tbsellhurryitem selectByPrimaryKey(TbsellhurryitemKey key);

    int updateByPrimaryKeySelective(Tbsellhurryitem record);

    int updateByPrimaryKey(Tbsellhurryitem record);
}