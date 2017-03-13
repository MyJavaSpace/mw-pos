package com.pos.dao;

import com.pos.entity.Tbexpcls;
import com.pos.entity.TbexpclsKey;

public interface TbexpclsMapper {
    int deleteByPrimaryKey(TbexpclsKey key);

    int insert(Tbexpcls record);

    int insertSelective(Tbexpcls record);

    Tbexpcls selectByPrimaryKey(TbexpclsKey key);

    int updateByPrimaryKeySelective(Tbexpcls record);

    int updateByPrimaryKey(Tbexpcls record);
}