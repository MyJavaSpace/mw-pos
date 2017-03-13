package com.pos.dao;

import com.pos.entity.Tbsell;
import com.pos.entity.TbsellKey;

public interface TbsellMapper {
    int deleteByPrimaryKey(TbsellKey key);

    int insert(Tbsell record);

    int insertSelective(Tbsell record);

    Tbsell selectByPrimaryKey(TbsellKey key);

    int updateByPrimaryKeySelective(Tbsell record);

    int updateByPrimaryKey(Tbsell record);
}