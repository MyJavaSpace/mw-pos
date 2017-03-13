package com.pos.dao;

import com.pos.entity.Expcls;
import com.pos.entity.ExpclsKey;

public interface ExpclsMapper {
    int deleteByPrimaryKey(ExpclsKey key);

    int insert(Expcls record);

    int insertSelective(Expcls record);

    Expcls selectByPrimaryKey(ExpclsKey key);

    int updateByPrimaryKeySelective(Expcls record);

    int updateByPrimaryKey(Expcls record);
}