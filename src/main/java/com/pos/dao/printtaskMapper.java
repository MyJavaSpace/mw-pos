package com.pos.dao;

import com.pos.entity.printtask;
import com.pos.entity.printtaskWithBLOBs;

public interface printtaskMapper {
    int deleteByPrimaryKey(Integer fiprintno);

    int insert(printtaskWithBLOBs record);

    int insertSelective(printtaskWithBLOBs record);

    printtaskWithBLOBs selectByPrimaryKey(Integer fiprintno);

    int updateByPrimaryKeySelective(printtaskWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(printtaskWithBLOBs record);

    int updateByPrimaryKey(printtask record);
}