/**
* @Title: HospitalService.java
* @Package com.sysnet.dbsb.service
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:49:40
* @version V1.0
*/
package com.sysnet.dbsb.service;

import com.sysnet.dbsb.model.common.Hospital;

/**
* @ClassName: HospitalService
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:49:40
*/
public interface HospitalService {
	/**
	 * 
	* @Title: queryById
	* @Description: 
	* @param id
	* @return Hospital
	* @throws
	 */
	public Hospital queryById(String id);

}
