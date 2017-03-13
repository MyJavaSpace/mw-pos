package com.pos.dao;

import com.pos.entity.Role;
import com.pos.entity.RoleKey;

public interface RoleMapper {
    int deleteByPrimaryKey(RoleKey key);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(RoleKey key);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}