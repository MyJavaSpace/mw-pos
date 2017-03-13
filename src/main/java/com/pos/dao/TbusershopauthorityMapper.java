package com.pos.dao;

import com.pos.entity.Tbusershopauthority;
import com.pos.entity.TbusershopauthorityKey;

public interface TbusershopauthorityMapper {
    int deleteByPrimaryKey(TbusershopauthorityKey key);

    int insert(Tbusershopauthority record);

    int insertSelective(Tbusershopauthority record);

    Tbusershopauthority selectByPrimaryKey(TbusershopauthorityKey key);

    int updateByPrimaryKeySelective(Tbusershopauthority record);

    int updateByPrimaryKey(Tbusershopauthority record);
}