package com.pos.dao;

import com.pos.entity.Tbmenuitemmuldept;
import com.pos.entity.TbmenuitemmuldeptKey;

public interface TbmenuitemmuldeptMapper {
    int deleteByPrimaryKey(TbmenuitemmuldeptKey key);

    int insert(Tbmenuitemmuldept record);

    int insertSelective(Tbmenuitemmuldept record);

    Tbmenuitemmuldept selectByPrimaryKey(TbmenuitemmuldeptKey key);

    int updateByPrimaryKeySelective(Tbmenuitemmuldept record);

    int updateByPrimaryKey(Tbmenuitemmuldept record);
}