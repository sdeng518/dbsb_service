package com.sysnet.dbsb.dao;

import com.sysnet.dbsb.model.common.FeeSettlement;

public interface FeeSettlementMapper {
    int deleteByPrimaryKey(String ID);

    int insert(FeeSettlement record);

    int insertSelective(FeeSettlement record);

    FeeSettlement selectByPrimaryKey(String ID);

    int updateByPrimaryKeySelective(FeeSettlement record);

    int updateByPrimaryKey(FeeSettlement record);
}