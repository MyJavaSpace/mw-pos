package com.pos.dao;

import com.pos.entity.Tbaddr;
import com.pos.entity.TbaddrKey;

public interface TbaddrMapper {
    int deleteByPrimaryKey(TbaddrKey key);

    int insert(Tbaddr record);

    int insertSelective(Tbaddr record);

    Tbaddr selectByPrimaryKey(TbaddrKey key);

    int updateByPrimaryKeySelective(Tbaddr record);

    int updateByPrimaryKey(Tbaddr record);
}