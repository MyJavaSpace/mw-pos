package com.pos.dao;

import com.pos.entity.Tbmenuingredientgp;
import com.pos.entity.TbmenuingredientgpKey;

public interface TbmenuingredientgpMapper {
    int deleteByPrimaryKey(TbmenuingredientgpKey key);

    int insert(Tbmenuingredientgp record);

    int insertSelective(Tbmenuingredientgp record);

    Tbmenuingredientgp selectByPrimaryKey(TbmenuingredientgpKey key);

    int updateByPrimaryKeySelective(Tbmenuingredientgp record);

    int updateByPrimaryKey(Tbmenuingredientgp record);
}