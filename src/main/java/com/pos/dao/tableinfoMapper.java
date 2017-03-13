package com.pos.dao;

import com.pos.entity.tableinfo;
import com.pos.entity.tableinfoKey;

public interface tableinfoMapper {
    int deleteByPrimaryKey(tableinfoKey key);

    int insert(tableinfo record);

    int insertSelective(tableinfo record);

    tableinfo selectByPrimaryKey(tableinfoKey key);

    int updateByPrimaryKeySelective(tableinfo record);

    int updateByPrimaryKey(tableinfo record);
}