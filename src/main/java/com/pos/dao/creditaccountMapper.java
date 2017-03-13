package com.pos.dao;

import com.pos.entity.creditaccount;
import com.pos.entity.creditaccountKey;

public interface creditaccountMapper {
    int deleteByPrimaryKey(creditaccountKey key);

    int insert(creditaccount record);

    int insertSelective(creditaccount record);

    creditaccount selectByPrimaryKey(creditaccountKey key);

    int updateByPrimaryKeySelective(creditaccount record);

    int updateByPrimaryKey(creditaccount record);
}