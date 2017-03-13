package com.pos.dao;

import com.pos.entity.Tbwechatconfig;

public interface TbwechatconfigMapper {
    int deleteByPrimaryKey(String fsId);

    int insert(Tbwechatconfig record);

    int insertSelective(Tbwechatconfig record);

    Tbwechatconfig selectByPrimaryKey(String fsId);

    int updateByPrimaryKeySelective(Tbwechatconfig record);

    int updateByPrimaryKey(Tbwechatconfig record);
}