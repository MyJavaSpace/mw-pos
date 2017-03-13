package com.pos.dao;

import com.pos.entity.Tbprinter;
import com.pos.entity.TbprinterKey;

public interface TbprinterMapper {
    int deleteByPrimaryKey(TbprinterKey key);

    int insert(Tbprinter record);

    int insertSelective(Tbprinter record);

    Tbprinter selectByPrimaryKey(TbprinterKey key);

    int updateByPrimaryKeySelective(Tbprinter record);

    int updateByPrimaryKey(Tbprinter record);
}