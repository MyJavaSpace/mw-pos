package com.pos.dao;

import com.pos.entity.Tbmenuingredient;
import com.pos.entity.TbmenuingredientKey;

public interface TbmenuingredientMapper {
    int deleteByPrimaryKey(TbmenuingredientKey key);

    int insert(Tbmenuingredient record);

    int insertSelective(Tbmenuingredient record);

    Tbmenuingredient selectByPrimaryKey(TbmenuingredientKey key);

    int updateByPrimaryKeySelective(Tbmenuingredient record);

    int updateByPrimaryKey(Tbmenuingredient record);
}