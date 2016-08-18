/**
* @Title: RecordService.java
* @Package com.sysnet.dbsb.service
* @Description: 
* @author dengweihua
* @date 2016年4月13日 下午3:54:53
* @version V1.0
*/
package com.sysnet.dbsb.service;

/**
* @ClassName: RecordService
* @Description: 
* @author dengweihua
* @date 2016年4月13日 下午3:54:53
*/
public interface RecordService {
	/**
	 * 
	* @Title: afterUploadTreat
	* @Description: 
	* @param medical_record_no
	* @param hospital_registration_sn
	* @param responseXml void
	* @throws
	 */
	public void afterUploadTreat(String medical_record_no, String hospital_registration_sn, String responseXml);
}
