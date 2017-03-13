package com.pos.dao;

import com.pos.entity.Sellreceive;
import com.pos.entity.SellreceiveKey;

public interface SellreceiveMapper {
    int deleteByPrimaryKey(SellreceiveKey key);

    int insert(Sellreceive record);

    int insertSelective(Sellreceive record);

    Sellreceive selectByPrimaryKey(SellreceiveKey key);

    int updateByPrimaryKeySelective(Sellreceive record);

    int updateByPrimaryKeyWithBLOBs(Sellreceive record);

    int updateByPrimaryKey(Sellreceive record);
}