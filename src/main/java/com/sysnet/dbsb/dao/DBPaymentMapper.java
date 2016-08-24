package com.sysnet.dbsb.dao;

import com.sysnet.common.base.dao.BaseDao;
import com.sysnet.dbsb.model.common.DBPayment;
import com.sysnet.dbsb.model.common.DBPaymentKey;

public interface DBPaymentMapper  extends BaseDao<DBPayment> {
    int deleteByPrimaryKey(DBPaymentKey key);

    int insert(DBPayment record);

    int insertSelective(DBPayment record);

    DBPayment selectByPrimaryKey(DBPaymentKey key);

    int updateByPrimaryKeySelective(DBPayment record);

    int updateByPrimaryKey(DBPayment record);
}