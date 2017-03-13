package com.pos.dao;

import com.pos.entity.Tbseqno;
import com.pos.entity.TbseqnoKey;

public interface TbseqnoMapper {
    int deleteByPrimaryKey(TbseqnoKey key);

    int insert(Tbseqno record);

    int insertSelective(Tbseqno record);

    Tbseqno selectByPrimaryKey(TbseqnoKey key);

    int updateByPrimaryKeySelective(Tbseqno record);

    int updateByPrimaryKey(Tbseqno record);
}