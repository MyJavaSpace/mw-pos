package com.pos.dao;

import com.pos.entity.Tbmenucls;
import com.pos.entity.TbmenuclsKey;

public interface TbmenuclsMapper {
    int deleteByPrimaryKey(TbmenuclsKey key);

    int insert(Tbmenucls record);

    int insertSelective(Tbmenucls record);

    Tbmenucls selectByPrimaryKey(TbmenuclsKey key);

    int updateByPrimaryKeySelective(Tbmenucls record);

    int updateByPrimaryKey(Tbmenucls record);
}