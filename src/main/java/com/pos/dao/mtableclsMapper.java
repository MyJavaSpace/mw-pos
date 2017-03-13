package com.pos.dao;

import com.pos.entity.mtablecls;
import com.pos.entity.mtableclsKey;

public interface mtableclsMapper {
    int deleteByPrimaryKey(mtableclsKey key);

    int insert(mtablecls record);

    int insertSelective(mtablecls record);

    mtablecls selectByPrimaryKey(mtableclsKey key);

    int updateByPrimaryKeySelective(mtablecls record);

    int updateByPrimaryKey(mtablecls record);
}