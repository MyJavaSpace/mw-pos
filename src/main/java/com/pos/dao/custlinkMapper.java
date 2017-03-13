package com.pos.dao;

import com.pos.entity.custlinkKey;

public interface custlinkMapper {
    int deleteByPrimaryKey(custlinkKey key);

    int insert(custlinkKey record);

    int insertSelective(custlinkKey record);
}