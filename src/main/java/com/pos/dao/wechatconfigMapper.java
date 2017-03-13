package com.pos.dao;

import com.pos.entity.wechatconfig;

public interface wechatconfigMapper {
    int deleteByPrimaryKey(String fsid);

    int insert(wechatconfig record);

    int insertSelective(wechatconfig record);

    wechatconfig selectByPrimaryKey(String fsid);

    int updateByPrimaryKeySelective(wechatconfig record);

    int updateByPrimaryKey(wechatconfig record);
}