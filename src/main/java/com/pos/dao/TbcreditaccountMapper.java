package com.pos.dao;

import com.pos.entity.Tbcreditaccount;
import com.pos.entity.TbcreditaccountKey;

public interface TbcreditaccountMapper {
    int deleteByPrimaryKey(TbcreditaccountKey key);

    int insert(Tbcreditaccount record);

    int insertSelective(Tbcreditaccount record);

    Tbcreditaccount selectByPrimaryKey(TbcreditaccountKey key);

    int updateByPrimaryKeySelective(Tbcreditaccount record);

    int updateByPrimaryKey(Tbcreditaccount record);
}