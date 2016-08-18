/**
* @Title: FeeList.java
* @Package com.sysnet.dbsb.model.picc.H213
* @Description: 
* @author dengweihua
* @date 2016年2月17日 下午6:09:02
* @version V1.0
*/
package com.sysnet.dbsb.model.picc.H213;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: FeeList
 * @Description:
 * @author dengweihua
 * @date 2016年2月17日 下午6:09:02
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "FeeList")
public class FeeList {
	@XmlElement
	private String HospitalCode = "";// 定点医疗机构编码
	@XmlElement
	private String ClinicSerialNum = "";// 住院（门诊）登记号
	@XmlElement
	private String ReceiptNum = "";// 票据号
	@XmlElement
	private String SenderCode = "140310";// 统筹区编码
	@XmlElement
	private String TransactionType = "1";// 定点医疗机构编码交易类型（1-正交易，-1-负交易
	@XmlElement
	private String HisCode = "";// His 目录编码
	@XmlElement
	private String HisName = "";// His 目录名称
	@XmlElement
	private String NrcCode = "";// 农合目录编码
	@XmlElement
	private String NrcName = "";// 农合目录名称
	@XmlElement
	private String PiccCode = "";// PICC 目录编码
	@XmlElement
	private String PiccName = "";// PICC 目录名称
	@XmlElement
	private String Charge_date = "";// 处方日期，格式 2013-01-0110:30:30

	@XmlElement
	private String ListSerialNum = "99999";// 清单流水号（处方号）
	@XmlElement
	private String Charge_Catalog_Type = "";// 收费项目种类，参见代码说明

	@XmlElement
	private String FeeClassification = "";// 收费类别，参见代码说明
	@XmlElement
	private String UnitPrice = "";// 单价
	@XmlElement
	private String Quantity = "";// 数量
	@XmlElement
	private String Amount = "";// 金额（金额=单价*数量）
	@XmlElement
	private String AccordingBasicPayment = "";// 纳入新农合报销范围费用
	@XmlElement
	private String DoctorCode = "";// 处方医师编号
	@XmlElement
	private String DoctorName = "";// 处方医师姓名
	@XmlElement
	private String Department = "";// 科室名称
	@XmlElement
	private String Operator = "";// 经办人
	@XmlElement
	private String OperatorDate = "";// 经办日期
	@XmlElement
	private String ReserveField1 = "";//
	@XmlElement
	private String ReserveField2 = "";//
	@XmlElement
	private String ReserveField3 = "";//

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

	/**
	 * @return transactionType
	 */
	public String getTransactionType() {
		return TransactionType;
	}

	/**
	 * @param transactionType
	 *            要设置的 transactionType
	 */
	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}

	/**
	 * @return hisCode
	 */
	public String getHisCode() {
		return HisCode;
	}

	/**
	 * @param hisCode
	 *            要设置的 hisCode
	 */
	public void setHisCode(String hisCode) {
		HisCode = hisCode;
	}

	/**
	 * @return hisName
	 */
	public String getHisName() {
		return HisName;
	}

	/**
	 * @param hisName
	 *            要设置的 hisName
	 */
	public void setHisName(String hisName) {
		HisName = hisName;
	}

	/**
	 * @return nrcCode
	 */
	public String getNrcCode() {
		return NrcCode;
	}

	/**
	 * @param nrcCode
	 *            要设置的 nrcCode
	 */
	public void setNrcCode(String nrcCode) {
		NrcCode = nrcCode;
	}

	/**
	 * @return nrcName
	 */
	public String getNrcName() {
		return NrcName;
	}

	/**
	 * @param nrcName
	 *            要设置的 nrcName
	 */
	public void setNrcName(String nrcName) {
		NrcName = nrcName;
	}

	/**
	 * @return piccCode
	 */
	public String getPiccCode() {
		return PiccCode;
	}

	/**
	 * @param piccCode
	 *            要设置的 piccCode
	 */
	public void setPiccCode(String piccCode) {
		PiccCode = piccCode;
	}

	/**
	 * @return piccName
	 */
	public String getPiccName() {
		return PiccName;
	}

	/**
	 * @param piccName
	 *            要设置的 piccName
	 */
	public void setPiccName(String piccName) {
		PiccName = piccName;
	}

	/**
	 * @return charge_date
	 */
	public String getCharge_date() {
		return Charge_date;
	}

	/**
	 * @param charge_date
	 *            要设置的 charge_date
	 */
	public void setCharge_date(String charge_date) {
		Charge_date = charge_date;
	}

	/**
	 * @return listSerialNum
	 */
	public String getListSerialNum() {
		return ListSerialNum;
	}

	/**
	 * @param listSerialNum
	 *            要设置的 listSerialNum
	 */
	public void setListSerialNum(String listSerialNum) {
		ListSerialNum = listSerialNum;
	}

	/**
	 * @return charge_Catalog_Type
	 */
	public String getCharge_Catalog_Type() {
		return Charge_Catalog_Type;
	}

	/**
	 * @param charge_Catalog_Type
	 *            要设置的 charge_Catalog_Type
	 */
	public void setCharge_Catalog_Type(String charge_Catalog_Type) {
		Charge_Catalog_Type = charge_Catalog_Type;
	}

	/**
	 * @return feeClassification
	 */
	public String getFeeClassification() {
		return FeeClassification;
	}

	/**
	 * @param feeClassification
	 *            要设置的 feeClassification
	 */
	public void setFeeClassification(String feeClassification) {
		FeeClassification = feeClassification;
	}

	/**
	 * @return unitPrice
	 */
	public String getUnitPrice() {
		return UnitPrice;
	}

	/**
	 * @param unitPrice
	 *            要设置的 unitPrice
	 */
	public void setUnitPrice(String unitPrice) {
		UnitPrice = unitPrice;
	}

	/**
	 * @return quantity
	 */
	public String getQuantity() {
		return Quantity;
	}

	/**
	 * @param quantity
	 *            要设置的 quantity
	 */
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	/**
	 * @return amount
	 */
	public String getAmount() {
		return Amount;
	}

	/**
	 * @param amount
	 *            要设置的 amount
	 */
	public void setAmount(String amount) {
		Amount = amount;
	}

	/**
	 * @return accordingBasicPayment
	 */
	public String getAccordingBasicPayment() {
		return AccordingBasicPayment;
	}

	/**
	 * @param accordingBasicPayment
	 *            要设置的 accordingBasicPayment
	 */
	public void setAccordingBasicPayment(String accordingBasicPayment) {
		AccordingBasicPayment = accordingBasicPayment;
	}

	/**
	 * @return doctorCode
	 */
	public String getDoctorCode() {
		return DoctorCode;
	}

	/**
	 * @param doctorCode
	 *            要设置的 doctorCode
	 */
	public void setDoctorCode(String doctorCode) {
		DoctorCode = doctorCode;
	}

	/**
	 * @return doctorName
	 */
	public String getDoctorName() {
		return DoctorName;
	}

	/**
	 * @param doctorName
	 *            要设置的 doctorName
	 */
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}

	/**
	 * @return department
	 */
	public String getDepartment() {
		return Department;
	}

	/**
	 * @param department
	 *            要设置的 department
	 */
	public void setDepartment(String department) {
		Department = department;
	}

	/**
	 * @return operator
	 */
	public String getOperator() {
		return Operator;
	}

	/**
	 * @param operator
	 *            要设置的 operator
	 */
	public void setOperator(String operator) {
		Operator = operator;
	}

	/**
	 * @return operatorDate
	 */
	public String getOperatorDate() {
		return OperatorDate;
	}

	/**
	 * @param operatorDate
	 *            要设置的 operatorDate
	 */
	public void setOperatorDate(String operatorDate) {
		OperatorDate = operatorDate;
	}

	/**
	 * @return reserveField1
	 */
	public String getReserveField1() {
		return ReserveField1;
	}

	/**
	 * @param reserveField1
	 *            要设置的 reserveField1
	 */
	public void setReserveField1(String reserveField1) {
		ReserveField1 = reserveField1;
	}

	/**
	 * @return reserveField2
	 */
	public String getReserveField2() {
		return ReserveField2;
	}

	/**
	 * @param reserveField2
	 *            要设置的 reserveField2
	 */
	public void setReserveField2(String reserveField2) {
		ReserveField2 = reserveField2;
	}

	/**
	 * @return reserveField3
	 */
	public String getReserveField3() {
		return ReserveField3;
	}

	/**
	 * @param reserveField3
	 *            要设置的 reserveField3
	 */
	public void setReserveField3(String reserveField3) {
		ReserveField3 = reserveField3;
	}

}
