package com.pos.dao;

import com.pos.entity.Tbreportconfiguration;
import com.pos.entity.TbreportconfigurationKey;

public interface TbreportconfigurationMapper {
    int deleteByPrimaryKey(TbreportconfigurationKey key);

    int insert(Tbreportconfiguration record);

    int insertSelective(Tbreportconfiguration record);

    Tbreportconfiguration selectByPrimaryKey(TbreportconfigurationKey key);

    int updateByPrimaryKeySelective(Tbreportconfiguration record);

    int updateByPrimaryKey(Tbreportconfiguration record);
}