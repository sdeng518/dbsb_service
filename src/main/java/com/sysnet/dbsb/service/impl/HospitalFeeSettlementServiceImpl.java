/**
* @Title: HospitalFeeSettlementServiceImpl.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:20:20
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sysnet.dbsb.dao.HospitalFeeSettlementDao;
import com.sysnet.dbsb.model.common.HospitalFeeSettlement;
import com.sysnet.dbsb.service.HospitalFeeSettlementService;

/**
* @ClassName: HospitalFeeSettlementServiceImpl
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:20:20
*/
@Service
public class HospitalFeeSettlementServiceImpl implements HospitalFeeSettlementService {
	@Resource
	private HospitalFeeSettlementDao hospitalFeeSettlementDao;
	/* (非 Javadoc)
	* <p>Title: queryById</p>
	* <p>Description: </p>
	* @param id
	* @return
	* @see com.sysnet.dbsb.service.HospitalFeeSettlementService#queryById(java.lang.String)
	*/
	@Override
	public HospitalFeeSettlement queryById(String id) {
		return hospitalFeeSettlementDao.queryById(id);
	}

}
