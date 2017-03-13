package com.pos.dao;

import com.pos.entity.changetable;

public interface changetableMapper {
    int insert(changetable record);

    int insertSelective(changetable record);
}