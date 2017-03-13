package com.pos.dao;

import com.pos.entity.Tbhost;
import com.pos.entity.TbhostKey;

public interface TbhostMapper {
    int deleteByPrimaryKey(TbhostKey key);

    int insert(Tbhost record);

    int insertSelective(Tbhost record);

    Tbhost selectByPrimaryKey(TbhostKey key);

    int updateByPrimaryKeySelective(Tbhost record);

    int updateByPrimaryKey(Tbhost record);
}