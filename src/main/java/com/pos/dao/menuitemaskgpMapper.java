package com.pos.dao;

import com.pos.entity.menuitemaskgp;
import com.pos.entity.menuitemaskgpKey;

public interface menuitemaskgpMapper {
    int deleteByPrimaryKey(menuitemaskgpKey key);

    int insert(menuitemaskgp record);

    int insertSelective(menuitemaskgp record);

    menuitemaskgp selectByPrimaryKey(menuitemaskgpKey key);

    int updateByPrimaryKeySelective(menuitemaskgp record);

    int updateByPrimaryKey(menuitemaskgp record);
}