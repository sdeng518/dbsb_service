/**
* @Title: ResponseService.java
* @Package com.sysnet.dbsb.service
* @Description: 
* @author dengweihua
* @date 2016年3月23日 上午11:29:01
* @version V1.0
*/
package com.sysnet.dbsb.service;

import com.sysnet.dbsb.model.common.FeeSettlement;

/**
* @ClassName: ResponseService
* @Description: 
* @author dengweihua
* @date 2016年3月23日 上午11:29:01
*/
public interface ResponseService {
	public int insertSelective(FeeSettlement record);
}
