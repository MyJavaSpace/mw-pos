package com.pos.dao;

import com.pos.entity.Tbmarea;
import com.pos.entity.TbmareaKey;

public interface TbmareaMapper {
    int deleteByPrimaryKey(TbmareaKey key);

    int insert(Tbmarea record);

    int insertSelective(Tbmarea record);

    Tbmarea selectByPrimaryKey(TbmareaKey key);

    int updateByPrimaryKeySelective(Tbmarea record);

    int updateByPrimaryKey(Tbmarea record);
}