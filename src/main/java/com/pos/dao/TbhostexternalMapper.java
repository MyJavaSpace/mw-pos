package com.pos.dao;

import com.pos.entity.Tbhostexternal;
import com.pos.entity.TbhostexternalKey;

public interface TbhostexternalMapper {
    int deleteByPrimaryKey(TbhostexternalKey key);

    int insert(Tbhostexternal record);

    int insertSelective(Tbhostexternal record);

    Tbhostexternal selectByPrimaryKey(TbhostexternalKey key);

    int updateByPrimaryKeySelective(Tbhostexternal record);

    int updateByPrimaryKeyWithBLOBs(Tbhostexternal record);

    int updateByPrimaryKey(Tbhostexternal record);
}