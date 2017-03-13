package com.pos.dao;

import com.pos.entity.reporttemplet;
import com.pos.entity.reporttempletKey;

public interface reporttempletMapper {
    int deleteByPrimaryKey(reporttempletKey key);

    int insert(reporttemplet record);

    int insertSelective(reporttemplet record);

    reporttemplet selectByPrimaryKey(reporttempletKey key);

    int updateByPrimaryKeySelective(reporttemplet record);

    int updateByPrimaryKey(reporttemplet record);
}