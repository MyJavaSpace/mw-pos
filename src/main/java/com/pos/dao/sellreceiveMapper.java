package com.pos.dao;

import com.pos.entity.sellreceive;
import com.pos.entity.sellreceiveKey;

public interface sellreceiveMapper {
    int deleteByPrimaryKey(sellreceiveKey key);

    int insert(sellreceive record);

    int insertSelective(sellreceive record);

    sellreceive selectByPrimaryKey(sellreceiveKey key);

    int updateByPrimaryKeySelective(sellreceive record);

    int updateByPrimaryKeyWithBLOBs(sellreceive record);

    int updateByPrimaryKey(sellreceive record);
}