package com.pos.dao;

import com.pos.entity.ask;
import com.pos.entity.askKey;

public interface askMapper {
    int deleteByPrimaryKey(askKey key);

    int insert(ask record);

    int insertSelective(ask record);

    ask selectByPrimaryKey(askKey key);

    int updateByPrimaryKeySelective(ask record);

    int updateByPrimaryKey(ask record);
}