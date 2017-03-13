package com.pos.dao;

import com.pos.entity.Apiexchange;
import com.pos.entity.ApiexchangeWithBLOBs;

public interface ApiexchangeMapper {
    int deleteByPrimaryKey(String fsid);

    int insert(ApiexchangeWithBLOBs record);

    int insertSelective(ApiexchangeWithBLOBs record);

    ApiexchangeWithBLOBs selectByPrimaryKey(String fsid);

    int updateByPrimaryKeySelective(ApiexchangeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ApiexchangeWithBLOBs record);

    int updateByPrimaryKey(Apiexchange record);
}