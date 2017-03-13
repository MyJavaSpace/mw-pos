package com.pos.dao;

import com.pos.entity.menuingredient;
import com.pos.entity.menuingredientKey;

public interface menuingredientMapper {
    int deleteByPrimaryKey(menuingredientKey key);

    int insert(menuingredient record);

    int insertSelective(menuingredient record);

    menuingredient selectByPrimaryKey(menuingredientKey key);

    int updateByPrimaryKeySelective(menuingredient record);

    int updateByPrimaryKey(menuingredient record);
}