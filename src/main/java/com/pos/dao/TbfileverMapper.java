package com.pos.dao;

import com.pos.entity.Tbfilever;

public interface TbfileverMapper {
    int deleteByPrimaryKey(String fsFileName);

    int insert(Tbfilever record);

    int insertSelective(Tbfilever record);

    Tbfilever selectByPrimaryKey(String fsFileName);

    int updateByPrimaryKeySelective(Tbfilever record);

    int updateByPrimaryKey(Tbfilever record);
}