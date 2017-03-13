package com.pos.dao;

import com.pos.entity.Mtablecls;
import com.pos.entity.MtableclsKey;

public interface MtableclsMapper {
    int deleteByPrimaryKey(MtableclsKey key);

    int insert(Mtablecls record);

    int insertSelective(Mtablecls record);

    Mtablecls selectByPrimaryKey(MtableclsKey key);

    int updateByPrimaryKeySelective(Mtablecls record);

    int updateByPrimaryKey(Mtablecls record);
}