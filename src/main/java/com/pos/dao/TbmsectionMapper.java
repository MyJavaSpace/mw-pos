package com.pos.dao;

import com.pos.entity.Tbmsection;
import com.pos.entity.TbmsectionKey;

public interface TbmsectionMapper {
    int deleteByPrimaryKey(TbmsectionKey key);

    int insert(Tbmsection record);

    int insertSelective(Tbmsection record);

    Tbmsection selectByPrimaryKey(TbmsectionKey key);

    int updateByPrimaryKeySelective(Tbmsection record);

    int updateByPrimaryKey(Tbmsection record);
}