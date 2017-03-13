package com.pos.dao;

import com.pos.entity.Menuitemaskgp;
import com.pos.entity.MenuitemaskgpKey;

public interface MenuitemaskgpMapper {
    int deleteByPrimaryKey(MenuitemaskgpKey key);

    int insert(Menuitemaskgp record);

    int insertSelective(Menuitemaskgp record);

    Menuitemaskgp selectByPrimaryKey(MenuitemaskgpKey key);

    int updateByPrimaryKeySelective(Menuitemaskgp record);

    int updateByPrimaryKey(Menuitemaskgp record);
}