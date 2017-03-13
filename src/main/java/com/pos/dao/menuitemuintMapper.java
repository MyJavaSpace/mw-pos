package com.pos.dao;

import com.pos.entity.Menuitemuint;

public interface MenuitemuintMapper {
    int deleteByPrimaryKey(Integer fiorderuintcd);

    int insert(Menuitemuint record);

    int insertSelective(Menuitemuint record);

    Menuitemuint selectByPrimaryKey(Integer fiorderuintcd);

    int updateByPrimaryKeySelective(Menuitemuint record);

    int updateByPrimaryKey(Menuitemuint record);
}