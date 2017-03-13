package com.pos.dao;

import com.pos.entity.paymentdetail;
import com.pos.entity.paymentdetailKey;
import com.pos.entity.paymentdetailWithBLOBs;

public interface paymentdetailMapper {
    int deleteByPrimaryKey(paymentdetailKey key);

    int insert(paymentdetailWithBLOBs record);

    int insertSelective(paymentdetailWithBLOBs record);

    paymentdetailWithBLOBs selectByPrimaryKey(paymentdetailKey key);

    int updateByPrimaryKeySelective(paymentdetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(paymentdetailWithBLOBs record);

    int updateByPrimaryKey(paymentdetail record);
}