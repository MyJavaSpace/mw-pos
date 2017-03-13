package com.pos.dao;

import com.pos.entity.wordhouse;
import com.pos.entity.wordhouseKey;

public interface wordhouseMapper {
    int deleteByPrimaryKey(wordhouseKey key);

    int insert(wordhouse record);

    int insertSelective(wordhouse record);

    wordhouse selectByPrimaryKey(wordhouseKey key);

    int updateByPrimaryKeySelective(wordhouse record);

    int updateByPrimaryKey(wordhouse record);
}