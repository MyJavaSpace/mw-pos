package com.pos.dao;

import com.pos.entity.trade;
import com.pos.entity.tradeKey;

public interface tradeMapper {
    int deleteByPrimaryKey(tradeKey key);

    int insert(trade record);

    int insertSelective(trade record);

    trade selectByPrimaryKey(tradeKey key);

    int updateByPrimaryKeySelective(trade record);

    int updateByPrimaryKey(trade record);
}