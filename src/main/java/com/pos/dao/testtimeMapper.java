package com.pos.dao;

import com.pos.entity.testtime;

public interface testtimeMapper {
    int insert(testtime record);

    int insertSelective(testtime record);
}