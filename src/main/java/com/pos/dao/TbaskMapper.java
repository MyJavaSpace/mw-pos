package com.pos.dao;

import com.pos.entity.Tbask;
import com.pos.entity.TbaskKey;

public interface TbaskMapper {
    int deleteByPrimaryKey(TbaskKey key);

    int insert(Tbask record);

    int insertSelective(Tbask record);

    Tbask selectByPrimaryKey(TbaskKey key);

    int updateByPrimaryKeySelective(Tbask record);

    int updateByPrimaryKey(Tbask record);
}