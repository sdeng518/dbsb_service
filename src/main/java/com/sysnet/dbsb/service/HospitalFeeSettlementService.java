/**
* @Title: HospitalFeeSettlementService.java
* @Package com.sysnet.dbsb.service
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:15:23
* @version V1.0
*/
package com.sysnet.dbsb.service;

import com.sysnet.dbsb.model.common.HospitalFeeSettlement;

/**
* @ClassName: HospitalFeeSettlementService
* @Description: 住院结算
* @author dengweihua
* @date 2016年1月26日 上午11:15:23
*/
public interface HospitalFeeSettlementService {
	public HospitalFeeSettlement queryById(String id);
}
