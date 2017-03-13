package com.pos.dao;

import com.pos.entity.Viplvl;
import com.pos.entity.ViplvlKey;

public interface ViplvlMapper {
    int deleteByPrimaryKey(ViplvlKey key);

    int insert(Viplvl record);

    int insertSelective(Viplvl record);

    Viplvl selectByPrimaryKey(ViplvlKey key);

    int updateByPrimaryKeySelective(Viplvl record);

    int updateByPrimaryKey(Viplvl record);
}