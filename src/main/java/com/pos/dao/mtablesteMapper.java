package com.pos.dao;

import com.pos.entity.mtableste;
import com.pos.entity.mtablesteKey;

public interface mtablesteMapper {
    int deleteByPrimaryKey(mtablesteKey key);

    int insert(mtableste record);

    int insertSelective(mtableste record);

    mtableste selectByPrimaryKey(mtablesteKey key);

    int updateByPrimaryKeySelective(mtableste record);

    int updateByPrimaryKey(mtableste record);
}