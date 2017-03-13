package com.pos.dao;

import com.pos.entity.Tbusermenuitemrole;
import com.pos.entity.TbusermenuitemroleKey;

public interface TbusermenuitemroleMapper {
    int deleteByPrimaryKey(TbusermenuitemroleKey key);

    int insert(Tbusermenuitemrole record);

    int insertSelective(Tbusermenuitemrole record);

    Tbusermenuitemrole selectByPrimaryKey(TbusermenuitemroleKey key);

    int updateByPrimaryKeySelective(Tbusermenuitemrole record);

    int updateByPrimaryKey(Tbusermenuitemrole record);
}