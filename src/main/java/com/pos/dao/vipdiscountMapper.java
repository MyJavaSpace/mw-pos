package com.pos.dao;

import com.pos.entity.vipdiscount;
import com.pos.entity.vipdiscountKey;

public interface vipdiscountMapper {
    int deleteByPrimaryKey(vipdiscountKey key);

    int insert(vipdiscount record);

    int insertSelective(vipdiscount record);

    vipdiscount selectByPrimaryKey(vipdiscountKey key);

    int updateByPrimaryKeySelective(vipdiscount record);

    int updateByPrimaryKey(vipdiscount record);
}