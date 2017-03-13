package com.pos.dao;

import com.pos.entity.menuitemmuldept;
import com.pos.entity.menuitemmuldeptKey;

public interface menuitemmuldeptMapper {
    int deleteByPrimaryKey(menuitemmuldeptKey key);

    int insert(menuitemmuldept record);

    int insertSelective(menuitemmuldept record);

    menuitemmuldept selectByPrimaryKey(menuitemmuldeptKey key);

    int updateByPrimaryKeySelective(menuitemmuldept record);

    int updateByPrimaryKey(menuitemmuldept record);
}