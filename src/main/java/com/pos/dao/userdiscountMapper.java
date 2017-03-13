package com.pos.dao;

import com.pos.entity.userdiscount;
import com.pos.entity.userdiscountKey;

public interface userdiscountMapper {
    int deleteByPrimaryKey(userdiscountKey key);

    int insert(userdiscount record);

    int insertSelective(userdiscount record);

    userdiscount selectByPrimaryKey(userdiscountKey key);

    int updateByPrimaryKeySelective(userdiscount record);

    int updateByPrimaryKey(userdiscount record);
}