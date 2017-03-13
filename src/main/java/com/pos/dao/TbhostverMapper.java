package com.pos.dao;

import com.pos.entity.Tbhostver;
import com.pos.entity.TbhostverKey;

public interface TbhostverMapper {
    int deleteByPrimaryKey(TbhostverKey key);

    int insert(Tbhostver record);

    int insertSelective(Tbhostver record);

    Tbhostver selectByPrimaryKey(TbhostverKey key);

    int updateByPrimaryKeySelective(Tbhostver record);

    int updateByPrimaryKey(Tbhostver record);
}