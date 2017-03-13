package com.pos.dao;

import com.pos.entity.Tbtransferprn;
import com.pos.entity.TbtransferprnKey;

public interface TbtransferprnMapper {
    int deleteByPrimaryKey(TbtransferprnKey key);

    int insert(Tbtransferprn record);

    int insertSelective(Tbtransferprn record);

    Tbtransferprn selectByPrimaryKey(TbtransferprnKey key);

    int updateByPrimaryKeySelective(Tbtransferprn record);

    int updateByPrimaryKey(Tbtransferprn record);
}