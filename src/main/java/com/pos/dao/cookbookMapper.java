package com.pos.dao;

import com.pos.entity.cookbook;
import com.pos.entity.cookbookKey;

public interface cookbookMapper {
    int deleteByPrimaryKey(cookbookKey key);

    int insert(cookbook record);

    int insertSelective(cookbook record);

    cookbook selectByPrimaryKey(cookbookKey key);

    int updateByPrimaryKeySelective(cookbook record);

    int updateByPrimaryKey(cookbook record);
}