package com.pos.dao;

import com.pos.entity.userrole;
import com.pos.entity.userroleKey;

public interface userroleMapper {
    int deleteByPrimaryKey(userroleKey key);

    int insert(userrole record);

    int insertSelective(userrole record);

    userrole selectByPrimaryKey(userroleKey key);

    int updateByPrimaryKeySelective(userrole record);

    int updateByPrimaryKey(userrole record);
}