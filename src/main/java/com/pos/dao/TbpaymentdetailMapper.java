package com.pos.dao;

import com.pos.entity.Tbpaymentdetail;
import com.pos.entity.TbpaymentdetailKey;
import com.pos.entity.TbpaymentdetailWithBLOBs;

public interface TbpaymentdetailMapper {
    int deleteByPrimaryKey(TbpaymentdetailKey key);

    int insert(TbpaymentdetailWithBLOBs record);

    int insertSelective(TbpaymentdetailWithBLOBs record);

    TbpaymentdetailWithBLOBs selectByPrimaryKey(TbpaymentdetailKey key);

    int updateByPrimaryKeySelective(TbpaymentdetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbpaymentdetailWithBLOBs record);

    int updateByPrimaryKey(Tbpaymentdetail record);
}