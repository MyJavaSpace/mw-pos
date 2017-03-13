package com.pos.dao;

import com.pos.entity.Testtime;

public interface TesttimeMapper {
    int insert(Testtime record);

    int insertSelective(Testtime record);
}