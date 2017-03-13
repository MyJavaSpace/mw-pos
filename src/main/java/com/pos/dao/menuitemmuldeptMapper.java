package com.pos.dao;

import com.pos.entity.Menuitemmuldept;
import com.pos.entity.MenuitemmuldeptKey;

public interface MenuitemmuldeptMapper {
    int deleteByPrimaryKey(MenuitemmuldeptKey key);

    int insert(Menuitemmuldept record);

    int insertSelective(Menuitemmuldept record);

    Menuitemmuldept selectByPrimaryKey(MenuitemmuldeptKey key);

    int updateByPrimaryKeySelective(Menuitemmuldept record);

    int updateByPrimaryKey(Menuitemmuldept record);
}