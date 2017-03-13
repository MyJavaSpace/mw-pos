package com.pos.dao;

import com.pos.entity.askgp;
import com.pos.entity.askgpKey;

public interface askgpMapper {
    int deleteByPrimaryKey(askgpKey key);

    int insert(askgp record);

    int insertSelective(askgp record);

    askgp selectByPrimaryKey(askgpKey key);

    int updateByPrimaryKeySelective(askgp record);

    int updateByPrimaryKey(askgp record);
}