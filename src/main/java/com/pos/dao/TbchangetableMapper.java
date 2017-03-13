package com.pos.dao;

import com.pos.entity.Tbchangetable;

public interface TbchangetableMapper {
    int insert(Tbchangetable record);

    int insertSelective(Tbchangetable record);
}