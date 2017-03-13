package com.pos.dao;

import com.pos.entity.TableKey;

public interface TableKeyMapper {
    int deleteByPrimaryKey(String table_name);

    int insert(TableKey record);

    int insertSelective(TableKey record);

    TableKey selectByPrimaryKey(String table_name);

    int updateByPrimaryKeySelective(TableKey record);

    int updateByPrimaryKey(TableKey record);
}