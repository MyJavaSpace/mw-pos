package com.pos.dao;

import com.pos.entity.Apiinfo;

public interface ApiinfoMapper {
    int deleteByPrimaryKey(String fsapiurl);

    int insert(Apiinfo record);

    int insertSelective(Apiinfo record);

    Apiinfo selectByPrimaryKey(String fsapiurl);

    int updateByPrimaryKeySelective(Apiinfo record);

    int updateByPrimaryKeyWithBLOBs(Apiinfo record);

    int updateByPrimaryKey(Apiinfo record);
}