package com.sysnet.dbsb.service;

import com.sysnet.dbsb.model.common.HospitalItem;

/**
 * 定点医疗机构
* @ClassName: HospitalItemService
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:11:46
 */
public interface HospitalItemService {
	/**
	 * 
	* @Title: queryById
	* @Description: 
	* @param id
	* @return HospitalItem
	* @throws
	 */
	public HospitalItem queryById(String id);
}
