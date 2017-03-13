package com.pos.dao;

import com.pos.entity.Apiflowing;
import com.pos.entity.ApiflowingWithBLOBs;

public interface ApiflowingMapper {
    int deleteByPrimaryKey(String fsflowingid);

    int insert(ApiflowingWithBLOBs record);

    int insertSelective(ApiflowingWithBLOBs record);

    ApiflowingWithBLOBs selectByPrimaryKey(String fsflowingid);

    int updateByPrimaryKeySelective(ApiflowingWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ApiflowingWithBLOBs record);

    int updateByPrimaryKey(Apiflowing record);
}