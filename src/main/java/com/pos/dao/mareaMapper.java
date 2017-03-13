package com.pos.dao;

import com.pos.entity.Marea;
import com.pos.entity.MareaKey;

public interface MareaMapper {
    int deleteByPrimaryKey(MareaKey key);

    int insert(Marea record);

    int insertSelective(Marea record);

    Marea selectByPrimaryKey(MareaKey key);

    int updateByPrimaryKeySelective(Marea record);

    int updateByPrimaryKey(Marea record);
}