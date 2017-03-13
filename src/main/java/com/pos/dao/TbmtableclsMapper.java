package com.pos.dao;

import com.pos.entity.Tbmtablecls;
import com.pos.entity.TbmtableclsKey;

public interface TbmtableclsMapper {
    int deleteByPrimaryKey(TbmtableclsKey key);

    int insert(Tbmtablecls record);

    int insertSelective(Tbmtablecls record);

    Tbmtablecls selectByPrimaryKey(TbmtableclsKey key);

    int updateByPrimaryKeySelective(Tbmtablecls record);

    int updateByPrimaryKey(Tbmtablecls record);
}