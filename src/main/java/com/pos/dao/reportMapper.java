package com.pos.dao;

import com.pos.entity.Report;
import com.pos.entity.ReportKey;

public interface ReportMapper {
    int deleteByPrimaryKey(ReportKey key);

    int insert(Report record);

    int insertSelective(Report record);

    Report selectByPrimaryKey(ReportKey key);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);
}