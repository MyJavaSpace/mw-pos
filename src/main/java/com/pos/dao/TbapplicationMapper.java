package com.pos.dao;

import com.pos.entity.Tbapplication;
import com.pos.entity.TbapplicationKey;

public interface TbapplicationMapper {
    int deleteByPrimaryKey(TbapplicationKey key);

    int insert(Tbapplication record);

    int insertSelective(Tbapplication record);

    Tbapplication selectByPrimaryKey(TbapplicationKey key);

    int updateByPrimaryKeySelective(Tbapplication record);

    int updateByPrimaryKey(Tbapplication record);
}