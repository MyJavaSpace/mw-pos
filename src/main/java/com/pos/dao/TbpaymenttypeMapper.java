package com.pos.dao;

import com.pos.entity.Tbpaymenttype;
import com.pos.entity.TbpaymenttypeKey;

public interface TbpaymenttypeMapper {
    int deleteByPrimaryKey(TbpaymenttypeKey key);

    int insert(Tbpaymenttype record);

    int insertSelective(Tbpaymenttype record);

    Tbpaymenttype selectByPrimaryKey(TbpaymenttypeKey key);

    int updateByPrimaryKeySelective(Tbpaymenttype record);

    int updateByPrimaryKey(Tbpaymenttype record);
}