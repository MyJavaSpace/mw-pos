package com.pos.dao;

import com.pos.entity.Tbviplvl;
import com.pos.entity.TbviplvlKey;

public interface TbviplvlMapper {
    int deleteByPrimaryKey(TbviplvlKey key);

    int insert(Tbviplvl record);

    int insertSelective(Tbviplvl record);

    Tbviplvl selectByPrimaryKey(TbviplvlKey key);

    int updateByPrimaryKeySelective(Tbviplvl record);

    int updateByPrimaryKey(Tbviplvl record);
}