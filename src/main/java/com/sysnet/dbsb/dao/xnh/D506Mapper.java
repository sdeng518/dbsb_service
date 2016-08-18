package com.sysnet.dbsb.dao.xnh;

import com.sysnet.dbsb.model.plicc.xnh.D506;
import com.sysnet.dbsb.model.plicc.xnh.D506Key;

public interface D506Mapper {
    int deleteByPrimaryKey(D506Key key);

    int insert(D506 record);

    int insertSelective(D506 record);

    D506 selectByPrimaryKey(D506Key key);

    int updateByPrimaryKeySelective(D506 record);

    int updateByPrimaryKey(D506 record);
}