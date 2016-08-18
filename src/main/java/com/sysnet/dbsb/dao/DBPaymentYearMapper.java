package com.sysnet.dbsb.dao;

import com.sysnet.dbsb.model.common.DBPaymentYear;
import com.sysnet.dbsb.model.common.DBPaymentYearKey;

public interface DBPaymentYearMapper {
    int deleteByPrimaryKey(DBPaymentYearKey key);

    int insert(DBPaymentYear record);

    int insertSelective(DBPaymentYear record);

    DBPaymentYear selectByPrimaryKey(DBPaymentYearKey key);

    int updateByPrimaryKeySelective(DBPaymentYear record);

    int updateByPrimaryKey(DBPaymentYear record);
}