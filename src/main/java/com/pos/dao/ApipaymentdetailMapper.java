package com.pos.dao;

import com.pos.entity.Apipaymentdetail;
import com.pos.entity.ApipaymentdetailWithBLOBs;

public interface ApipaymentdetailMapper {
    int deleteByPrimaryKey(String fspayno);

    int insert(ApipaymentdetailWithBLOBs record);

    int insertSelective(ApipaymentdetailWithBLOBs record);

    ApipaymentdetailWithBLOBs selectByPrimaryKey(String fspayno);

    int updateByPrimaryKeySelective(ApipaymentdetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ApipaymentdetailWithBLOBs record);

    int updateByPrimaryKey(Apipaymentdetail record);
}