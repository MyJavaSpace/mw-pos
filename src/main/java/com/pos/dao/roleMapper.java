package com.pos.dao;

import com.pos.entity.role;
import com.pos.entity.roleKey;

public interface roleMapper {
    int deleteByPrimaryKey(roleKey key);

    int insert(role record);

    int insertSelective(role record);

    role selectByPrimaryKey(roleKey key);

    int updateByPrimaryKeySelective(role record);

    int updateByPrimaryKey(role record);
}