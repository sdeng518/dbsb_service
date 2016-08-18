/**
* @Title: Body_Request_H214.java
* @Package com.sysnet.dbsb.model.picc.H214
* @Description: 
* @author dengweihua
* @date 2016年2月17日 下午6:23:04
* @version V1.0
*/
package com.sysnet.dbsb.model.picc.H214;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: Body_Request_H214
 * @Description:
 * @author dengweihua
 * @date 2016年2月17日 下午6:23:04
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class Body_Request_H214 {
	@XmlElement
	private String HospitalCode = "";// 定点医疗机构编码
	@XmlElement
	private String ClinicSerialNum = "";// @XmlElement住院（门诊）登记号（报审 单号）
	@XmlElement
	private String ClinicNum = "";// 住院（门诊）号
	@XmlElement
	private String ReceiptNum = "";// 票据号
	@XmlElement
	private String SenderCode = "140310";// 统筹区编码

	/**
	 * @return hospitalCode
	 */
	public String getHospitalCode() {
		return HospitalCode;
	}

	/**
	 * @param hospitalCode
	 *            要设置的 hospitalCode
	 */
	public void setHospitalCode(String hospitalCode) {
		HospitalCode = hospitalCode;
	}

	/**
	 * @return clinicSerialNum
	 */
	public String getClinicSerialNum() {
		return ClinicSerialNum;
	}

	/**
	 * @param clinicSerialNum
	 *            要设置的 clinicSerialNum
	 */
	public void setClinicSerialNum(String clinicSerialNum) {
		ClinicSerialNum = clinicSerialNum;
	}

	/**
	 * @return clinicNum
	 */
	public String getClinicNum() {
		return ClinicNum;
	}

	/**
	 * @param clinicNum
	 *            要设置的 clinicNum
	 */
	public void setClinicNum(String clinicNum) {
		ClinicNum = clinicNum;
	}

	/**
	 * @return receiptNum
	 */
	public String getReceiptNum() {
		return ReceiptNum;
	}

	/**
	 * @param receiptNum
	 *            要设置的 receiptNum
	 */
	public void setReceiptNum(String receiptNum) {
		ReceiptNum = receiptNum;
	}

	/**
	 * @return senderCode
	 */
	public String getSenderCode() {
		return SenderCode;
	}

	/**
	 * @param senderCode
	 *            要设置的 senderCode
	 */
	public void setSenderCode(String senderCode) {
		SenderCode = senderCode;
	}

}
