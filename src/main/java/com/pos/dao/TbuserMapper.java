package com.pos.dao;

import com.pos.entity.Tbuser;
import com.pos.entity.TbuserKey;

public interface TbuserMapper {
    int deleteByPrimaryKey(TbuserKey key);

    int insert(Tbuser record);

    int insertSelective(Tbuser record);

    Tbuser selectByPrimaryKey(TbuserKey key);

    int updateByPrimaryKeySelective(Tbuser record);

    int updateByPrimaryKey(Tbuser record);
}