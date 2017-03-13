package com.pos.dao;

import com.pos.entity.transferprn;
import com.pos.entity.transferprnKey;

public interface transferprnMapper {
    int deleteByPrimaryKey(transferprnKey key);

    int insert(transferprn record);

    int insertSelective(transferprn record);

    transferprn selectByPrimaryKey(transferprnKey key);

    int updateByPrimaryKeySelective(transferprn record);

    int updateByPrimaryKey(transferprn record);
}