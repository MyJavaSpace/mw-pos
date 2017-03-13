package com.pos.dao;

import com.pos.entity.Tbuserauthdata;
import com.pos.entity.TbuserauthdataKey;

public interface TbuserauthdataMapper {
    int deleteByPrimaryKey(TbuserauthdataKey key);

    int insert(Tbuserauthdata record);

    int insertSelective(Tbuserauthdata record);

    Tbuserauthdata selectByPrimaryKey(TbuserauthdataKey key);

    int updateByPrimaryKeySelective(Tbuserauthdata record);

    int updateByPrimaryKey(Tbuserauthdata record);
}