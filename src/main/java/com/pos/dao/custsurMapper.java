package com.pos.dao;

import com.pos.entity.Custsur;
import com.pos.entity.CustsurKey;

public interface CustsurMapper {
    int deleteByPrimaryKey(CustsurKey key);

    int insert(Custsur record);

    int insertSelective(Custsur record);

    Custsur selectByPrimaryKey(CustsurKey key);

    int updateByPrimaryKeySelective(Custsur record);

    int updateByPrimaryKey(Custsur record);
}