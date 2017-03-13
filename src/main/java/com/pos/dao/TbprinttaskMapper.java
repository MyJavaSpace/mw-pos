package com.pos.dao;

import com.pos.entity.Tbprinttask;
import com.pos.entity.TbprinttaskWithBLOBs;

public interface TbprinttaskMapper {
    int deleteByPrimaryKey(Integer fiPrintNo);

    int insert(TbprinttaskWithBLOBs record);

    int insertSelective(TbprinttaskWithBLOBs record);

    TbprinttaskWithBLOBs selectByPrimaryKey(Integer fiPrintNo);

    int updateByPrimaryKeySelective(TbprinttaskWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbprinttaskWithBLOBs record);

    int updateByPrimaryKey(Tbprinttask record);
}