package com.pos.dao;

import com.pos.entity.dept;
import com.pos.entity.deptKey;

public interface deptMapper {
    int deleteByPrimaryKey(deptKey key);

    int insert(dept record);

    int insertSelective(dept record);

    dept selectByPrimaryKey(deptKey key);

    int updateByPrimaryKeySelective(dept record);

    int updateByPrimaryKey(dept record);
}