package com.pos.dao;

import com.pos.entity.Askgp;
import com.pos.entity.AskgpKey;

public interface AskgpMapper {
    int deleteByPrimaryKey(AskgpKey key);

    int insert(Askgp record);

    int insertSelective(Askgp record);

    Askgp selectByPrimaryKey(AskgpKey key);

    int updateByPrimaryKeySelective(Askgp record);

    int updateByPrimaryKey(Askgp record);
}