package com.pos.dao;

import com.pos.entity.Tbprintproject;

public interface TbprintprojectMapper {
    int deleteByPrimaryKey(Integer fiId);

    int insert(Tbprintproject record);

    int insertSelective(Tbprintproject record);

    Tbprintproject selectByPrimaryKey(Integer fiId);

    int updateByPrimaryKeySelective(Tbprintproject record);

    int updateByPrimaryKey(Tbprintproject record);
}