package com.pos.dao;

import com.pos.entity.Ask;
import com.pos.entity.AskKey;

public interface AskMapper {
    int deleteByPrimaryKey(AskKey key);

    int insert(Ask record);

    int insertSelective(Ask record);

    Ask selectByPrimaryKey(AskKey key);

    int updateByPrimaryKeySelective(Ask record);

    int updateByPrimaryKey(Ask record);
}