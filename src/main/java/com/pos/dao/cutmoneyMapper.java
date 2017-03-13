package com.pos.dao;

import com.pos.entity.Cutmoney;
import com.pos.entity.CutmoneyKey;

public interface CutmoneyMapper {
    int deleteByPrimaryKey(CutmoneyKey key);

    int insert(Cutmoney record);

    int insertSelective(Cutmoney record);

    Cutmoney selectByPrimaryKey(CutmoneyKey key);

    int updateByPrimaryKeySelective(Cutmoney record);

    int updateByPrimaryKey(Cutmoney record);
}