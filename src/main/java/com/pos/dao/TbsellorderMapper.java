package com.pos.dao;

import com.pos.entity.Tbsellorder;
import com.pos.entity.TbsellorderKey;

public interface TbsellorderMapper {
    int deleteByPrimaryKey(TbsellorderKey key);

    int insert(Tbsellorder record);

    int insertSelective(Tbsellorder record);

    Tbsellorder selectByPrimaryKey(TbsellorderKey key);

    int updateByPrimaryKeySelective(Tbsellorder record);

    int updateByPrimaryKey(Tbsellorder record);
}