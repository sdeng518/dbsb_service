package com.sysnet.dbsb.dao;

import com.sysnet.common.base.dao.BaseDao;
import com.sysnet.dbsb.model.common.DBUploadMsg;
import com.sysnet.dbsb.model.common.DBUploadMsgKey;
import com.sysnet.dbsb.model.common.HospitalRegistration;

public interface DBUploadMsgMapper extends BaseDao<DBUploadMsg> {
    int deleteByPrimaryKey(DBUploadMsgKey key);

    int insert(DBUploadMsg record);

    int insertSelective(DBUploadMsg record);

    DBUploadMsg selectByPrimaryKey(DBUploadMsgKey key);

    int updateByPrimaryKeySelective(DBUploadMsg record);

    int updateByPrimaryKey(DBUploadMsg record);
}