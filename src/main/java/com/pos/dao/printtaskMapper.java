package com.pos.dao;

import com.pos.entity.Printtask;
import com.pos.entity.PrinttaskWithBLOBs;

public interface PrinttaskMapper {
    int deleteByPrimaryKey(Integer fiprintno);

    int insert(PrinttaskWithBLOBs record);

    int insertSelective(PrinttaskWithBLOBs record);

    PrinttaskWithBLOBs selectByPrimaryKey(Integer fiprintno);

    int updateByPrimaryKeySelective(PrinttaskWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PrinttaskWithBLOBs record);

    int updateByPrimaryKey(Printtask record);
}