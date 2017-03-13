package com.pos.dao;

import com.pos.entity.Apishopinfo;

public interface ApishopinfoMapper {
    int deleteByPrimaryKey(String fsshopguid);

    int insert(Apishopinfo record);

    int insertSelective(Apishopinfo record);

    Apishopinfo selectByPrimaryKey(String fsshopguid);

    int updateByPrimaryKeySelective(Apishopinfo record);

    int updateByPrimaryKey(Apishopinfo record);
}