package com.pos.dao;

import com.pos.entity.Tbaskgp;
import com.pos.entity.TbaskgpKey;

public interface TbaskgpMapper {
    int deleteByPrimaryKey(TbaskgpKey key);

    int insert(Tbaskgp record);

    int insertSelective(Tbaskgp record);

    Tbaskgp selectByPrimaryKey(TbaskgpKey key);

    int updateByPrimaryKeySelective(Tbaskgp record);

    int updateByPrimaryKey(Tbaskgp record);
}