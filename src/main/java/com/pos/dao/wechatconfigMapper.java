package com.pos.dao;

import com.pos.entity.Wechatconfig;

public interface WechatconfigMapper {
    int deleteByPrimaryKey(String fsid);

    int insert(Wechatconfig record);

    int insertSelective(Wechatconfig record);

    Wechatconfig selectByPrimaryKey(String fsid);

    int updateByPrimaryKeySelective(Wechatconfig record);

    int updateByPrimaryKey(Wechatconfig record);
}