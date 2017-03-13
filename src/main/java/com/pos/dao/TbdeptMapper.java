package com.pos.dao;

import com.pos.entity.Tbdept;
import com.pos.entity.TbdeptKey;

public interface TbdeptMapper {
    int deleteByPrimaryKey(TbdeptKey key);

    int insert(Tbdept record);

    int insertSelective(Tbdept record);

    Tbdept selectByPrimaryKey(TbdeptKey key);

    int updateByPrimaryKeySelective(Tbdept record);

    int updateByPrimaryKey(Tbdept record);
}