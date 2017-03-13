package com.pos.dao;

import com.pos.entity.CustlinkKey;

public interface CustlinkMapper {
    int deleteByPrimaryKey(CustlinkKey key);

    int insert(CustlinkKey record);

    int insertSelective(CustlinkKey record);
}