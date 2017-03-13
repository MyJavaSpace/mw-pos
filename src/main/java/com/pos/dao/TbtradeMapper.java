package com.pos.dao;

import com.pos.entity.Tbtrade;
import com.pos.entity.TbtradeKey;

public interface TbtradeMapper {
    int deleteByPrimaryKey(TbtradeKey key);

    int insert(Tbtrade record);

    int insertSelective(Tbtrade record);

    Tbtrade selectByPrimaryKey(TbtradeKey key);

    int updateByPrimaryKeySelective(Tbtrade record);

    int updateByPrimaryKey(Tbtrade record);
}