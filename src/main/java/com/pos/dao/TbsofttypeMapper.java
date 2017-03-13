package com.pos.dao;

import com.pos.entity.Tbsofttype;
import com.pos.entity.TbsofttypeKey;

public interface TbsofttypeMapper {
    int deleteByPrimaryKey(TbsofttypeKey key);

    int insert(Tbsofttype record);

    int insertSelective(Tbsofttype record);

    Tbsofttype selectByPrimaryKey(TbsofttypeKey key);

    int updateByPrimaryKeySelective(Tbsofttype record);

    int updateByPrimaryKey(Tbsofttype record);
}