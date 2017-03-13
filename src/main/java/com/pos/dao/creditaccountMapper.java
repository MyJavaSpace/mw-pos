package com.pos.dao;

import com.pos.entity.Creditaccount;
import com.pos.entity.CreditaccountKey;

public interface CreditaccountMapper {
    int deleteByPrimaryKey(CreditaccountKey key);

    int insert(Creditaccount record);

    int insertSelective(Creditaccount record);

    Creditaccount selectByPrimaryKey(CreditaccountKey key);

    int updateByPrimaryKeySelective(Creditaccount record);

    int updateByPrimaryKey(Creditaccount record);
}