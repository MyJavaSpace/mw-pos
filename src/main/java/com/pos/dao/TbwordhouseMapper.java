package com.pos.dao;

import com.pos.entity.Tbwordhouse;
import com.pos.entity.TbwordhouseKey;

public interface TbwordhouseMapper {
    int deleteByPrimaryKey(TbwordhouseKey key);

    int insert(Tbwordhouse record);

    int insertSelective(Tbwordhouse record);

    Tbwordhouse selectByPrimaryKey(TbwordhouseKey key);

    int updateByPrimaryKeySelective(Tbwordhouse record);

    int updateByPrimaryKey(Tbwordhouse record);
}