package com.pos.dao;

import com.pos.entity.cutmoney;
import com.pos.entity.cutmoneyKey;

public interface cutmoneyMapper {
    int deleteByPrimaryKey(cutmoneyKey key);

    int insert(cutmoney record);

    int insertSelective(cutmoney record);

    cutmoney selectByPrimaryKey(cutmoneyKey key);

    int updateByPrimaryKeySelective(cutmoney record);

    int updateByPrimaryKey(cutmoney record);
}