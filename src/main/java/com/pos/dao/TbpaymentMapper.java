package com.pos.dao;

import com.pos.entity.Tbpayment;
import com.pos.entity.TbpaymentKey;

public interface TbpaymentMapper {
    int deleteByPrimaryKey(TbpaymentKey key);

    int insert(Tbpayment record);

    int insertSelective(Tbpayment record);

    Tbpayment selectByPrimaryKey(TbpaymentKey key);

    int updateByPrimaryKeySelective(Tbpayment record);

    int updateByPrimaryKey(Tbpayment record);
}