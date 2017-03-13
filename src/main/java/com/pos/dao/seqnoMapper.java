package com.pos.dao;

import com.pos.entity.Seqno;
import com.pos.entity.SeqnoKey;

public interface SeqnoMapper {
    int deleteByPrimaryKey(SeqnoKey key);

    int insert(Seqno record);

    int insertSelective(Seqno record);

    Seqno selectByPrimaryKey(SeqnoKey key);

    int updateByPrimaryKeySelective(Seqno record);

    int updateByPrimaryKey(Seqno record);
}