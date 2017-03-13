package com.pos.dao;

import com.pos.entity.cookbookmenu;
import com.pos.entity.cookbookmenuKey;

public interface cookbookmenuMapper {
    int deleteByPrimaryKey(cookbookmenuKey key);

    int insert(cookbookmenu record);

    int insertSelective(cookbookmenu record);

    cookbookmenu selectByPrimaryKey(cookbookmenuKey key);

    int updateByPrimaryKeySelective(cookbookmenu record);

    int updateByPrimaryKey(cookbookmenu record);
}