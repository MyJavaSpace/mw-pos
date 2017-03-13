package com.pos.dao;

import com.pos.entity.Tbpaymentfullcut;
import com.pos.entity.TbpaymentfullcutKey;

public interface TbpaymentfullcutMapper {
    int deleteByPrimaryKey(TbpaymentfullcutKey key);

    int insert(Tbpaymentfullcut record);

    int insertSelective(Tbpaymentfullcut record);

    Tbpaymentfullcut selectByPrimaryKey(TbpaymentfullcutKey key);

    int updateByPrimaryKeySelective(Tbpaymentfullcut record);

    int updateByPrimaryKey(Tbpaymentfullcut record);
}