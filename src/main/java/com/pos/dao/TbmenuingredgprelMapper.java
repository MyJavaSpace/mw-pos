package com.pos.dao;

import com.pos.entity.Tbmenuingredgprel;
import com.pos.entity.TbmenuingredgprelKey;

public interface TbmenuingredgprelMapper {
    int deleteByPrimaryKey(TbmenuingredgprelKey key);

    int insert(Tbmenuingredgprel record);

    int insertSelective(Tbmenuingredgprel record);

    Tbmenuingredgprel selectByPrimaryKey(TbmenuingredgprelKey key);

    int updateByPrimaryKeySelective(Tbmenuingredgprel record);

    int updateByPrimaryKey(Tbmenuingredgprel record);
}