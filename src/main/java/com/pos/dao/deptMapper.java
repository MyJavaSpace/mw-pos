package com.pos.dao;

import com.pos.entity.Dept;
import com.pos.entity.DeptKey;

public interface DeptMapper {
    int deleteByPrimaryKey(DeptKey key);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(DeptKey key);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}