package com.pos.dao;

import com.pos.entity.Usershopauthority;
import com.pos.entity.UsershopauthorityKey;

public interface UsershopauthorityMapper {
    int deleteByPrimaryKey(UsershopauthorityKey key);

    int insert(Usershopauthority record);

    int insertSelective(Usershopauthority record);

    Usershopauthority selectByPrimaryKey(UsershopauthorityKey key);

    int updateByPrimaryKeySelective(Usershopauthority record);

    int updateByPrimaryKey(Usershopauthority record);
}