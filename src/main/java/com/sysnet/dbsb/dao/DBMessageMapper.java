package com.sysnet.dbsb.dao;

import com.sysnet.dbsb.model.common.DBMessage;

public interface DBMessageMapper {
    int deleteByPrimaryKey(String ID);

    int insert(DBMessage record);

    int insertSelective(DBMessage record);

    DBMessage selectByPrimaryKey(String ID);

    int updateByPrimaryKeySelective(DBMessage record);

    int updateByPrimaryKey(DBMessage record);
}