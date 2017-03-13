package com.pos.dao;

import com.pos.entity.Cookbookmenu;
import com.pos.entity.CookbookmenuKey;

public interface CookbookmenuMapper {
    int deleteByPrimaryKey(CookbookmenuKey key);

    int insert(Cookbookmenu record);

    int insertSelective(Cookbookmenu record);

    Cookbookmenu selectByPrimaryKey(CookbookmenuKey key);

    int updateByPrimaryKeySelective(Cookbookmenu record);

    int updateByPrimaryKey(Cookbookmenu record);
}