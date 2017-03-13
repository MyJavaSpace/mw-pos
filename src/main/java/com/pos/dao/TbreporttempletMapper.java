package com.pos.dao;

import com.pos.entity.Tbreporttemplet;
import com.pos.entity.TbreporttempletKey;

public interface TbreporttempletMapper {
    int deleteByPrimaryKey(TbreporttempletKey key);

    int insert(Tbreporttemplet record);

    int insertSelective(Tbreporttemplet record);

    Tbreporttemplet selectByPrimaryKey(TbreporttempletKey key);

    int updateByPrimaryKeySelective(Tbreporttemplet record);

    int updateByPrimaryKey(Tbreporttemplet record);
}