package com.pos.dao;

import com.pos.entity.Usermenuitemrole;
import com.pos.entity.UsermenuitemroleKey;

public interface UsermenuitemroleMapper {
    int deleteByPrimaryKey(UsermenuitemroleKey key);

    int insert(Usermenuitemrole record);

    int insertSelective(Usermenuitemrole record);

    Usermenuitemrole selectByPrimaryKey(UsermenuitemroleKey key);

    int updateByPrimaryKeySelective(Usermenuitemrole record);

    int updateByPrimaryKey(Usermenuitemrole record);
}