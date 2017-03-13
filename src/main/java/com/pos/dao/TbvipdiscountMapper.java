package com.pos.dao;

import com.pos.entity.Tbvipdiscount;
import com.pos.entity.TbvipdiscountKey;

public interface TbvipdiscountMapper {
    int deleteByPrimaryKey(TbvipdiscountKey key);

    int insert(Tbvipdiscount record);

    int insertSelective(Tbvipdiscount record);

    Tbvipdiscount selectByPrimaryKey(TbvipdiscountKey key);

    int updateByPrimaryKeySelective(Tbvipdiscount record);

    int updateByPrimaryKey(Tbvipdiscount record);
}