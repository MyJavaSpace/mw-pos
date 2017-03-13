package com.pos.dao;

import com.pos.entity.Billsource;
import com.pos.entity.BillsourceKey;

public interface BillsourceMapper {
    int deleteByPrimaryKey(BillsourceKey key);

    int insert(Billsource record);

    int insertSelective(Billsource record);

    Billsource selectByPrimaryKey(BillsourceKey key);

    int updateByPrimaryKeySelective(Billsource record);

    int updateByPrimaryKey(Billsource record);
}