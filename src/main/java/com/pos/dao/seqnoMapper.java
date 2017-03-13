package com.pos.dao;

import com.pos.entity.seqno;
import com.pos.entity.seqnoKey;

public interface seqnoMapper {
    int deleteByPrimaryKey(seqnoKey key);

    int insert(seqno record);

    int insertSelective(seqno record);

    seqno selectByPrimaryKey(seqnoKey key);

    int updateByPrimaryKeySelective(seqno record);

    int updateByPrimaryKey(seqno record);
}