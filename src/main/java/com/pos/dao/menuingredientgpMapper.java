package com.pos.dao;

import com.pos.entity.menuingredientgp;
import com.pos.entity.menuingredientgpKey;

public interface menuingredientgpMapper {
    int deleteByPrimaryKey(menuingredientgpKey key);

    int insert(menuingredientgp record);

    int insertSelective(menuingredientgp record);

    menuingredientgp selectByPrimaryKey(menuingredientgpKey key);

    int updateByPrimaryKeySelective(menuingredientgp record);

    int updateByPrimaryKey(menuingredientgp record);
}