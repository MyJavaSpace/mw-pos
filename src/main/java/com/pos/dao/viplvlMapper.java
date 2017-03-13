package com.pos.dao;

import com.pos.entity.viplvl;
import com.pos.entity.viplvlKey;

public interface viplvlMapper {
    int deleteByPrimaryKey(viplvlKey key);

    int insert(viplvl record);

    int insertSelective(viplvl record);

    viplvl selectByPrimaryKey(viplvlKey key);

    int updateByPrimaryKeySelective(viplvl record);

    int updateByPrimaryKey(viplvl record);
}