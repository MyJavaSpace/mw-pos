package com.pos.dao;

import com.pos.entity.Reporttemplet;
import com.pos.entity.ReporttempletKey;

public interface ReporttempletMapper {
    int deleteByPrimaryKey(ReporttempletKey key);

    int insert(Reporttemplet record);

    int insertSelective(Reporttemplet record);

    Reporttemplet selectByPrimaryKey(ReporttempletKey key);

    int updateByPrimaryKeySelective(Reporttemplet record);

    int updateByPrimaryKey(Reporttemplet record);
}