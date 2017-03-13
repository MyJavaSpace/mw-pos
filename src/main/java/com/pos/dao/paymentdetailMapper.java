package com.pos.dao;

import com.pos.entity.Paymentdetail;
import com.pos.entity.PaymentdetailKey;
import com.pos.entity.PaymentdetailWithBLOBs;

public interface PaymentdetailMapper {
    int deleteByPrimaryKey(PaymentdetailKey key);

    int insert(PaymentdetailWithBLOBs record);

    int insertSelective(PaymentdetailWithBLOBs record);

    PaymentdetailWithBLOBs selectByPrimaryKey(PaymentdetailKey key);

    int updateByPrimaryKeySelective(PaymentdetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PaymentdetailWithBLOBs record);

    int updateByPrimaryKey(Paymentdetail record);
}