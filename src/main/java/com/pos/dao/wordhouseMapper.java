package com.pos.dao;

import com.pos.entity.Wordhouse;
import com.pos.entity.WordhouseKey;

public interface WordhouseMapper {
    int deleteByPrimaryKey(WordhouseKey key);

    int insert(Wordhouse record);

    int insertSelective(Wordhouse record);

    Wordhouse selectByPrimaryKey(WordhouseKey key);

    int updateByPrimaryKeySelective(Wordhouse record);

    int updateByPrimaryKey(Wordhouse record);
}