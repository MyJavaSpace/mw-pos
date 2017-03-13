package com.pos.dao;

import com.pos.entity.Tbcookbook;
import com.pos.entity.TbcookbookKey;

public interface TbcookbookMapper {
    int deleteByPrimaryKey(TbcookbookKey key);

    int insert(Tbcookbook record);

    int insertSelective(Tbcookbook record);

    Tbcookbook selectByPrimaryKey(TbcookbookKey key);

    int updateByPrimaryKeySelective(Tbcookbook record);

    int updateByPrimaryKey(Tbcookbook record);
}