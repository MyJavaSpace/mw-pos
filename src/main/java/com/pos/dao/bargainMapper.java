package com.pos.dao;

import com.pos.entity.Bargain;
import com.pos.entity.BargainKey;

public interface BargainMapper {
    int deleteByPrimaryKey(BargainKey key);

    int insert(Bargain record);

    int insertSelective(Bargain record);

    Bargain selectByPrimaryKey(BargainKey key);

    int updateByPrimaryKeySelective(Bargain record);

    int updateByPrimaryKey(Bargain record);
}