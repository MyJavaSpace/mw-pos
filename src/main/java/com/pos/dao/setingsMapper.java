package com.pos.dao;

import com.pos.entity.Setings;

public interface SetingsMapper {
    int deleteByPrimaryKey(String fskey);

    int insert(Setings record);

    int insertSelective(Setings record);

    Setings selectByPrimaryKey(String fskey);

    int updateByPrimaryKeySelective(Setings record);

    int updateByPrimaryKey(Setings record);
}