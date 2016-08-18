/**
* @Title: InsuredPersonService.java
* @Package com.sysnet.dbsb.service
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午4:07:08
* @version V1.0
*/
package com.sysnet.dbsb.service;

import com.sysnet.dbsb.model.common.InsuredPerson;

/**
* @ClassName: InsuredPersonService
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午4:07:08
*/
public interface InsuredPersonService {
	/**
	 * 
	* @Title: queryById
	* @Description: 通过医保号获取参保人信息
	* @param id
	* @return InsuredPerson
	* @throws
	 */
	public InsuredPerson queryById(String id);
}
