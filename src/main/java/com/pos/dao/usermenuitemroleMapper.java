package com.pos.dao;

import com.pos.entity.usermenuitemrole;
import com.pos.entity.usermenuitemroleKey;

public interface usermenuitemroleMapper {
    int deleteByPrimaryKey(usermenuitemroleKey key);

    int insert(usermenuitemrole record);

    int insertSelective(usermenuitemrole record);

    usermenuitemrole selectByPrimaryKey(usermenuitemroleKey key);

    int updateByPrimaryKeySelective(usermenuitemrole record);

    int updateByPrimaryKey(usermenuitemrole record);
}