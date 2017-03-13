package com.pos.dao;

import com.pos.entity.Cookbook;
import com.pos.entity.CookbookKey;

public interface CookbookMapper {
    int deleteByPrimaryKey(CookbookKey key);

    int insert(Cookbook record);

    int insertSelective(Cookbook record);

    Cookbook selectByPrimaryKey(CookbookKey key);

    int updateByPrimaryKeySelective(Cookbook record);

    int updateByPrimaryKey(Cookbook record);
}