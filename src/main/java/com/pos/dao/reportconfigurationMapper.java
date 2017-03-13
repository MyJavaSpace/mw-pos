package com.pos.dao;

import com.pos.entity.reportconfiguration;
import com.pos.entity.reportconfigurationKey;

public interface reportconfigurationMapper {
    int deleteByPrimaryKey(reportconfigurationKey key);

    int insert(reportconfiguration record);

    int insertSelective(reportconfiguration record);

    reportconfiguration selectByPrimaryKey(reportconfigurationKey key);

    int updateByPrimaryKeySelective(reportconfiguration record);

    int updateByPrimaryKey(reportconfiguration record);
}