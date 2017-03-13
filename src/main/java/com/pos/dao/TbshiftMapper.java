package com.pos.dao;

import com.pos.entity.Tbshift;
import com.pos.entity.TbshiftKey;

public interface TbshiftMapper {
    int deleteByPrimaryKey(TbshiftKey key);

    int insert(Tbshift record);

    int insertSelective(Tbshift record);

    Tbshift selectByPrimaryKey(TbshiftKey key);

    int updateByPrimaryKeySelective(Tbshift record);

    int updateByPrimaryKey(Tbshift record);
}