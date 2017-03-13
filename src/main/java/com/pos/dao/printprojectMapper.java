package com.pos.dao;

import com.pos.entity.printproject;

public interface printprojectMapper {
    int deleteByPrimaryKey(Integer fiid);

    int insert(printproject record);

    int insertSelective(printproject record);

    printproject selectByPrimaryKey(Integer fiid);

    int updateByPrimaryKeySelective(printproject record);

    int updateByPrimaryKey(printproject record);
}