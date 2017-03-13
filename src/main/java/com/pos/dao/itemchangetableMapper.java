package com.pos.dao;

import com.pos.entity.itemchangetable;

public interface itemchangetableMapper {
    int insert(itemchangetable record);

    int insertSelective(itemchangetable record);
}