package com.pos.dao;

import com.pos.entity.Tbsellreceive;
import com.pos.entity.TbsellreceiveKey;

public interface TbsellreceiveMapper {
    int deleteByPrimaryKey(TbsellreceiveKey key);

    int insert(Tbsellreceive record);

    int insertSelective(Tbsellreceive record);

    Tbsellreceive selectByPrimaryKey(TbsellreceiveKey key);

    int updateByPrimaryKeySelective(Tbsellreceive record);

    int updateByPrimaryKeyWithBLOBs(Tbsellreceive record);

    int updateByPrimaryKey(Tbsellreceive record);
}