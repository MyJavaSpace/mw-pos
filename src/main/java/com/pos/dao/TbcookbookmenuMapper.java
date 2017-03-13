package com.pos.dao;

import com.pos.entity.Tbcookbookmenu;
import com.pos.entity.TbcookbookmenuKey;

public interface TbcookbookmenuMapper {
    int deleteByPrimaryKey(TbcookbookmenuKey key);

    int insert(Tbcookbookmenu record);

    int insertSelective(Tbcookbookmenu record);

    Tbcookbookmenu selectByPrimaryKey(TbcookbookmenuKey key);

    int updateByPrimaryKeySelective(Tbcookbookmenu record);

    int updateByPrimaryKey(Tbcookbookmenu record);
}