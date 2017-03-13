package com.pos.dao;

import com.pos.entity.usershopauthority;
import com.pos.entity.usershopauthorityKey;

public interface usershopauthorityMapper {
    int deleteByPrimaryKey(usershopauthorityKey key);

    int insert(usershopauthority record);

    int insertSelective(usershopauthority record);

    usershopauthority selectByPrimaryKey(usershopauthorityKey key);

    int updateByPrimaryKeySelective(usershopauthority record);

    int updateByPrimaryKey(usershopauthority record);
}