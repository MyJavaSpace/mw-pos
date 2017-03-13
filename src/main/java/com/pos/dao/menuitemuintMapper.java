package com.pos.dao;

import com.pos.entity.menuitemuint;

public interface menuitemuintMapper {
    int deleteByPrimaryKey(Integer fiorderuintcd);

    int insert(menuitemuint record);

    int insertSelective(menuitemuint record);

    menuitemuint selectByPrimaryKey(Integer fiorderuintcd);

    int updateByPrimaryKeySelective(menuitemuint record);

    int updateByPrimaryKey(menuitemuint record);
}