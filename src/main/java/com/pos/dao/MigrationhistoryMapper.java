package com.pos.dao;

import com.pos.entity.Migrationhistory;

public interface MigrationhistoryMapper {
    int deleteByPrimaryKey(String migrationId);

    int insert(Migrationhistory record);

    int insertSelective(Migrationhistory record);

    Migrationhistory selectByPrimaryKey(String migrationId);

    int updateByPrimaryKeySelective(Migrationhistory record);

    int updateByPrimaryKeyWithBLOBs(Migrationhistory record);

    int updateByPrimaryKey(Migrationhistory record);
}