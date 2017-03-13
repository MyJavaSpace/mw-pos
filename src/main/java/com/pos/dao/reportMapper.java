package com.pos.dao;

import com.pos.entity.report;
import com.pos.entity.reportKey;

public interface reportMapper {
    int deleteByPrimaryKey(reportKey key);

    int insert(report record);

    int insertSelective(report record);

    report selectByPrimaryKey(reportKey key);

    int updateByPrimaryKeySelective(report record);

    int updateByPrimaryKey(report record);
}