package com.pos.dao;

import com.pos.entity.Tbsetings;

public interface TbsetingsMapper {
    int deleteByPrimaryKey(String fskey);

    int insert(Tbsetings record);

    int insertSelective(Tbsetings record);

    Tbsetings selectByPrimaryKey(String fskey);

    int updateByPrimaryKeySelective(Tbsetings record);

    int updateByPrimaryKey(Tbsetings record);
}