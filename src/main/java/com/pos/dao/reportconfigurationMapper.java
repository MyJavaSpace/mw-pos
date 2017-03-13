package com.pos.dao;

import com.pos.entity.Reportconfiguration;
import com.pos.entity.ReportconfigurationKey;

public interface ReportconfigurationMapper {
    int deleteByPrimaryKey(ReportconfigurationKey key);

    int insert(Reportconfiguration record);

    int insertSelective(Reportconfiguration record);

    Reportconfiguration selectByPrimaryKey(ReportconfigurationKey key);

    int updateByPrimaryKeySelective(Reportconfiguration record);

    int updateByPrimaryKey(Reportconfiguration record);
}