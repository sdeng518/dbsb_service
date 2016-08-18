/**
* @Title: UploadService.java
* @Package com.sysnet.dbsb.service
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午5:39:35
* @version V1.0
*/
package com.sysnet.dbsb.service;

/**
* @ClassName: UploadService
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午5:39:35
*/
public interface UploadService {
	/**
	 * 单个参保人上传
	* @Title: uploadPerson
	* @Description: 
	* @param id void
	* @throws
	 */
	public void uploadPerson(String id);
	/**
	 * 参保人批量上传
	* @Title: uploadAllPerson
	* @Description:  void
	* @throws
	 */
	public void uploadAllPerson();
	/**
	 * 单个定点机构上传
	* @Title: uploadHospital
	* @Description: 
	* @param id void
	* @throws
	 */
	public void uploadHospital(String id);
	/**
	 * 定点机构批量上传
	* @Title: uploadAllHospital
	* @Description:  void
	* @throws
	 */
	public void uploadAllHospital();
	/**
	 * 单次住院结果上传
	* @Title: uploadTreatment
	* @Description: 
	* @param id void
	* @throws
	 */
	public void uploadTreatment(String id);
	/**
	 * 上传单次就诊结算记录
	* @Title: uploadTreatment
	* @Description: 
	* @param medical_record_no
	* @param hospital_registration_sn void
	* @throws
	 */
	public void uploadTreatment(String medical_record_no,String hospital_registration_sn);
	/**
	 * 住院结算批量上传
	* @Title: uploadAllTreatment
	* @Description:  void
	* @throws
	 */
	public void uploadAllTreatment();
	/**
	 * 住院明细上传
	* @Title: uploadTreatDetail
	* @Description: 
	* @param id void
	* @throws
	 */
	public void uploadTreatDetail(String medical_record_no,String hospital_registration_sn);
	/**
	 * 结算回退
	* @Title: uploadCancelTreatment
	* @Description: 
	* @param id void
	* @throws
	 */
	public void uploadCancelTreatment(String medical_record_no,String hospital_registration_sn);
	
	/**
	 * 	费用信息查询
	* @Title: searchTreatment
	* @Description: 
	* @param medical_record_no
	* @param hospital_registration_sn void
	* @throws
	 */
	public void searchTreatment(String medical_record_no,String hospital_registration_sn);
	/**
	 * 住院补偿
	* @Title: uploadCompensation
	* @Description: 
	* @param medical_record_no
	* @param hospital_registration_sn void
	* @throws
	 */
	public void uploadCompensation(String medical_record_no,String hospital_registration_sn);
	
	/**
	 * 住院登记
	* @Title: uploadRegistration
	* @Description: 
	* @param medical_record_no
	* @param hospital_registration_sn void
	* @throws
	 */
	public void uploadRegistration(String medical_record_no, String hospital_registration_sn);
	
}
