package com.pos.dao;

import com.pos.entity.menuingredgprel;
import com.pos.entity.menuingredgprelKey;

public interface menuingredgprelMapper {
    int deleteByPrimaryKey(menuingredgprelKey key);

    int insert(menuingredgprel record);

    int insertSelective(menuingredgprel record);

    menuingredgprel selectByPrimaryKey(menuingredgprelKey key);

    int updateByPrimaryKeySelective(menuingredgprel record);

    int updateByPrimaryKey(menuingredgprel record);
}