package com.pos.dao;

import com.pos.entity.Trade;
import com.pos.entity.TradeKey;

public interface TradeMapper {
    int deleteByPrimaryKey(TradeKey key);

    int insert(Trade record);

    int insertSelective(Trade record);

    Trade selectByPrimaryKey(TradeKey key);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}