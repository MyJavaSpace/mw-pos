package com.pos.dao;

import com.pos.entity.billsource;
import com.pos.entity.billsourceKey;

public interface billsourceMapper {
    int deleteByPrimaryKey(billsourceKey key);

    int insert(billsource record);

    int insertSelective(billsource record);

    billsource selectByPrimaryKey(billsourceKey key);

    int updateByPrimaryKeySelective(billsource record);

    int updateByPrimaryKey(billsource record);
}