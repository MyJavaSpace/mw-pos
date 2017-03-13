package com.pos.dao;

import com.pos.entity.expcls;
import com.pos.entity.expclsKey;

public interface expclsMapper {
    int deleteByPrimaryKey(expclsKey key);

    int insert(expcls record);

    int insertSelective(expcls record);

    expcls selectByPrimaryKey(expclsKey key);

    int updateByPrimaryKeySelective(expcls record);

    int updateByPrimaryKey(expcls record);
}