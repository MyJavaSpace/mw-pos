package com.pos.dao;

import com.pos.entity.Userdiscount;
import com.pos.entity.UserdiscountKey;

public interface UserdiscountMapper {
    int deleteByPrimaryKey(UserdiscountKey key);

    int insert(Userdiscount record);

    int insertSelective(Userdiscount record);

    Userdiscount selectByPrimaryKey(UserdiscountKey key);

    int updateByPrimaryKeySelective(Userdiscount record);

    int updateByPrimaryKey(Userdiscount record);
}