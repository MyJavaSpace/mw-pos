package com.pos.dao;

import com.pos.entity.Transferprn;
import com.pos.entity.TransferprnKey;

public interface TransferprnMapper {
    int deleteByPrimaryKey(TransferprnKey key);

    int insert(Transferprn record);

    int insertSelective(Transferprn record);

    Transferprn selectByPrimaryKey(TransferprnKey key);

    int updateByPrimaryKeySelective(Transferprn record);

    int updateByPrimaryKey(Transferprn record);
}