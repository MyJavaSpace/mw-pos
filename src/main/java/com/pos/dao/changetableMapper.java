package com.pos.dao;

import com.pos.entity.Changetable;

public interface ChangetableMapper {
    int insert(Changetable record);

    int insertSelective(Changetable record);
}