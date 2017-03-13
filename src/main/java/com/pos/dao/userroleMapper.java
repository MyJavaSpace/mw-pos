package com.pos.dao;

import com.pos.entity.Userrole;
import com.pos.entity.UserroleKey;

public interface UserroleMapper {
    int deleteByPrimaryKey(UserroleKey key);

    int insert(Userrole record);

    int insertSelective(Userrole record);

    Userrole selectByPrimaryKey(UserroleKey key);

    int updateByPrimaryKeySelective(Userrole record);

    int updateByPrimaryKey(Userrole record);
}