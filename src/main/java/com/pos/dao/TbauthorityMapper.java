package com.pos.dao;

import com.pos.entity.Tbauthority;
import com.pos.entity.TbauthorityKey;

public interface TbauthorityMapper {
    int deleteByPrimaryKey(TbauthorityKey key);

    int insert(Tbauthority record);

    int insertSelective(Tbauthority record);

    Tbauthority selectByPrimaryKey(TbauthorityKey key);

    int updateByPrimaryKeySelective(Tbauthority record);

    int updateByPrimaryKey(Tbauthority record);
}