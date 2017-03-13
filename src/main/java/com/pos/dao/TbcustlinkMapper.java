package com.pos.dao;

import com.pos.entity.TbcustlinkKey;

public interface TbcustlinkMapper {
    int deleteByPrimaryKey(TbcustlinkKey key);

    int insert(TbcustlinkKey record);

    int insertSelective(TbcustlinkKey record);
}