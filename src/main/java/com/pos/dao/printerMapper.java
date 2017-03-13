package com.pos.dao;

import com.pos.entity.printer;
import com.pos.entity.printerKey;

public interface printerMapper {
    int deleteByPrimaryKey(printerKey key);

    int insert(printer record);

    int insertSelective(printer record);

    printer selectByPrimaryKey(printerKey key);

    int updateByPrimaryKeySelective(printer record);

    int updateByPrimaryKey(printer record);
}