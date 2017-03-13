package com.pos.dao;

import com.pos.entity.Tbtesttime;

public interface TbtesttimeMapper {
    int insert(Tbtesttime record);

    int insertSelective(Tbtesttime record);
}