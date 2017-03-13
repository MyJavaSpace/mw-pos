package com.pos.dao;

import com.pos.entity.Tbparamvalue;
import com.pos.entity.TbparamvalueKey;

public interface TbparamvalueMapper {
    int deleteByPrimaryKey(TbparamvalueKey key);

    int insert(Tbparamvalue record);

    int insertSelective(Tbparamvalue record);

    Tbparamvalue selectByPrimaryKey(TbparamvalueKey key);

    int updateByPrimaryKeySelective(Tbparamvalue record);

    int updateByPrimaryKey(Tbparamvalue record);
}