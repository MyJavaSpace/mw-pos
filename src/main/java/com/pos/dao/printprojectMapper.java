package com.pos.dao;

import com.pos.entity.Printproject;

public interface PrintprojectMapper {
    int deleteByPrimaryKey(Integer fiid);

    int insert(Printproject record);

    int insertSelective(Printproject record);

    Printproject selectByPrimaryKey(Integer fiid);

    int updateByPrimaryKeySelective(Printproject record);

    int updateByPrimaryKey(Printproject record);
}