package com.pos.dao;

import com.pos.entity.Tbsellhurry;
import com.pos.entity.TbsellhurryKey;

public interface TbsellhurryMapper {
    int deleteByPrimaryKey(TbsellhurryKey key);

    int insert(Tbsellhurry record);

    int insertSelective(Tbsellhurry record);

    Tbsellhurry selectByPrimaryKey(TbsellhurryKey key);

    int updateByPrimaryKeySelective(Tbsellhurry record);

    int updateByPrimaryKey(Tbsellhurry record);
}