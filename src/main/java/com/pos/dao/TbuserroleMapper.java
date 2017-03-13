package com.pos.dao;

import com.pos.entity.Tbuserrole;
import com.pos.entity.TbuserroleKey;

public interface TbuserroleMapper {
    int deleteByPrimaryKey(TbuserroleKey key);

    int insert(Tbuserrole record);

    int insertSelective(Tbuserrole record);

    Tbuserrole selectByPrimaryKey(TbuserroleKey key);

    int updateByPrimaryKeySelective(Tbuserrole record);

    int updateByPrimaryKey(Tbuserrole record);
}