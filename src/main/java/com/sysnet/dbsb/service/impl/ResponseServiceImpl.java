/**
* @Title: ResponseServiceImpl.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年3月23日 上午11:32:19
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sysnet.dbsb.dao.FeeSettlementMapper;
import com.sysnet.dbsb.model.common.FeeSettlement;
import com.sysnet.dbsb.service.ResponseService;

/**
* @ClassName: ResponseServiceImpl
* @Description: 
* @author dengweihua
* @date 2016年3月23日 上午11:32:19
*/
@Service
public class ResponseServiceImpl implements ResponseService {
	@Resource
	private FeeSettlementMapper feeSettlementMapper;
	/* (非 Javadoc)
	* <p>Title: insertSelective</p>
	* <p>Description: </p>
	* @param record
	* @return
	* @see com.sysnet.dbsb.service.ResponseService#insertSelective(com.sysnet.dbsb.model.common.FeeSettlement)
	*/
	@Override
	public int insertSelective(FeeSettlement record) {
		return feeSettlementMapper.insertSelective(record);
	}

}
