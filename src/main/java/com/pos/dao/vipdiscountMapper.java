package com.pos.dao;

import com.pos.entity.Vipdiscount;
import com.pos.entity.VipdiscountKey;

public interface VipdiscountMapper {
    int deleteByPrimaryKey(VipdiscountKey key);

    int insert(Vipdiscount record);

    int insertSelective(Vipdiscount record);

    Vipdiscount selectByPrimaryKey(VipdiscountKey key);

    int updateByPrimaryKeySelective(Vipdiscount record);

    int updateByPrimaryKey(Vipdiscount record);
}