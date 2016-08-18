/**
* @Title: HospitalRegistrationService.java
* @Package com.sysnet.dbsb.service
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:14:28
* @version V1.0
*/
package com.sysnet.dbsb.service;

import com.sysnet.dbsb.model.common.HospitalRegistration;

/**
* @ClassName: HospitalRegistrationService
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:14:28
*/
public interface HospitalRegistrationService {
	/**
	 * 
	* @Title: queryById
	* @Description: 
	* @param id
	* @return HospitalRegistration
	* @throws
	 */
	public HospitalRegistration queryById(String id);
}
