package com.pos.dao;

import com.pos.entity.Printer;
import com.pos.entity.PrinterKey;

public interface PrinterMapper {
    int deleteByPrimaryKey(PrinterKey key);

    int insert(Printer record);

    int insertSelective(Printer record);

    Printer selectByPrimaryKey(PrinterKey key);

    int updateByPrimaryKeySelective(Printer record);

    int updateByPrimaryKey(Printer record);
}