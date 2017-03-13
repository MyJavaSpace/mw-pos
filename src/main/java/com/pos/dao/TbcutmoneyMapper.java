package com.pos.dao;

import com.pos.entity.Tbcutmoney;
import com.pos.entity.TbcutmoneyKey;

public interface TbcutmoneyMapper {
    int deleteByPrimaryKey(TbcutmoneyKey key);

    int insert(Tbcutmoney record);

    int insertSelective(Tbcutmoney record);

    Tbcutmoney selectByPrimaryKey(TbcutmoneyKey key);

    int updateByPrimaryKeySelective(Tbcutmoney record);

    int updateByPrimaryKey(Tbcutmoney record);
}