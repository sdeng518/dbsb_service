package com.sysnet.dbsb.model.picc.H210;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 就诊结算信息
 * 
 * @author dengweihuaSenderCode
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "MedResult")
public class MedResult {
	/**
	 * 交易流水号 说明： 交易流水号必须是每 一次请求的唯一标识， 在整 个系统中是唯一的，因此开 发商应严格按照建议规则 生成交易流水号
	 * 规则：统筹区编码+ 时间 (14)+医院编号(8)+流水号 (4)，之间用-分隔 例： 371400-20120101083030-1
	 * 0011001-0001
	 */
	@XmlElement
	private String TransRefGUID = "";
	@XmlElement
	private String HospitalCode = "";// 定点医疗机构编码
	@XmlElement
	private String ClinicSerialNum = "";// 住院（门诊）登记号
	@XmlElement
	private String SenderCode = "140310";// 统筹区编码
	/**
	 * 票据号（单据号） 票据号（单据号） 说明： （1）农合系统传过来的住 院号 + 票据号 + 定点医 疗机构编码必须能够指定 唯一一条结算记录
	 * （2）对医院而言，单据号 是唯一的，撤销后重新结算 则此号需要更新 （3）不采用上面这种方式 的情况，可采用医院就诊登 记后，结算时的唯一流水。
	 */
	@XmlElement
	private String ReceiptNum = "";
	@XmlElement
	private String MedicalCategory = "21";// 医疗类别 21 医疗类别 普通住院
	@XmlElement
	private String InpatientDate = "";// 入院日期
	@XmlElement
	private String InpatientDiagnosisDiseaseCode = "";// 入院诊断疾病编码（ICD10）
	@XmlElement
	private String InpatientDiagnosisDiseaseName = "";// 入院诊断疾病名称
	@XmlElement
	private String Discharge_date = "";// 出院日期，格式2013-01-01 10:30:30
	@XmlElement
	private String Discharge_Reason = "1";// 出院原因
	@XmlElement
	private String DischargeCheifDiagnosis = "";// 出院疾病主要诊断编码
												// 说明：出院疾病主要诊断编码必须为ICD10标准编码
	@XmlElement
	private String DischargeCheifDiagnosisName = "";// 出院疾病主要诊断名称
	@XmlElement
	private String DepartmentCode = "";// 科室代码
	@XmlElement
	private String DepartmentName = "";// 科室名称
	@XmlElement
	private String SickbedNum = "";// 床位号
	@XmlElement
	private String DoctorCode = "";// 医生编号
	@XmlElement
	private String DoctorName = "";// 医生姓名
	@XmlElement
	private String ClinicNum = "";// 医院内部住院号
	@XmlElement
	private String MedicalPaymentTotalAmount = "";// 医疗费总额
	@XmlElement
	private String PlanFundBySI = "";// 农合补偿金额
	@XmlElement
	private String BigDiseaseCompenFee = "";// 大病补偿金额
	@XmlElement
	private String BasicMedTotalFeeAdd = "";// 农合累计可报费用
	@XmlElement
	private String StandardTotalFeeAdd = "";// 大病累计可报费用
	@XmlElement
	private String PlanFundBySIAdd = "";// 农合累计补偿金额
	@XmlElement
	private String BigDiseaseCompenFeeAdd = "";// 大病累计补偿金额
	@XmlElement
	private String FeeField1 = "";// 本次合规医疗费
	@XmlElement
	private String FeeField2 = "";// 本次剔除非合规医疗费
	/**
	 * 默认为空，如果启用（1-可以重复上传 0-不可以重 复上传）
	 */
	@XmlElement
	private String FeeField3 = "";// 预留3
	@XmlElement
	private String FeeField4 = "";// 预留4
	@XmlElement
	private String FeeField5 = "";// 预留5
	@XmlElement
	private String FeeField6 = "";// 预留6
	@XmlElement
	private String FeeField7 = "";// 预留7
	@XmlElement
	private String FeeField8 = "";// 预留8
	@XmlElement
	private String Formula = "";// 计算公式(不能出现”/”符号)
	@XmlElement
	private String Operator = "";// 经办人
	@XmlElement
	private String DistrictCode = "140310";// 统筹区编码
	@XmlElement
	private String ReserveField1 = "";// 出险日期
	@XmlElement
	private String ReserveField2 = "";// 预留字段2
	@XmlElement
	private String ReserveField3 = "";// 预留字段3
	/**
	 * 医保机构（新农合/医保中 心）报销标志（二版新加字 段，用来区分医保机构数据 是医院及时上传，还是医保 机构非及时报销。）
	 */
	@XmlElement
	private String MedicareOfficeApplyFlag = "";
	public String getTransRefGUID() {
		return TransRefGUID;
	}
	public void setTransRefGUID(String transRefGUID) {
		TransRefGUID = transRefGUID;
	}
	public String getHospitalCode() {
		return HospitalCode;
	}
	public void setHospitalCode(String hospitalCode) {
		HospitalCode = hospitalCode;
	}
	public String getClinicSerialNum() {
		return ClinicSerialNum;
	}
	public void setClinicSerialNum(String clinicSerialNum) {
		ClinicSerialNum = clinicSerialNum;
	}
	public String getSenderCode() {
		return SenderCode;
	}
	public void setSenderCode(String senderCode) {
		SenderCode = senderCode;
	}
	public String getReceiptNum() {
		return ReceiptNum;
	}
	public void setReceiptNum(String receiptNum) {
		ReceiptNum = receiptNum;
	}
	public String getMedicalCategory() {
		return MedicalCategory;
	}
	public void setMedicalCategory(String medicalCategory) {
		MedicalCategory = medicalCategory;
	}
	public String getInpatientDate() {
		return InpatientDate;
	}
	public void setInpatientDate(String inpatientDate) {
		if (inpatientDate.length() < 12) {
			inpatientDate += " 00:00:00";
		}
		InpatientDate = inpatientDate;
	}
	public String getInpatientDiagnosisDiseaseCode() {
		return InpatientDiagnosisDiseaseCode;
	}
	public void setInpatientDiagnosisDiseaseCode(
			String inpatientDiagnosisDiseaseCode) {
		InpatientDiagnosisDiseaseCode = inpatientDiagnosisDiseaseCode;
	}
	public String getInpatientDiagnosisDiseaseName() {
		return InpatientDiagnosisDiseaseName;
	}
	public void setInpatientDiagnosisDiseaseName(
			String inpatientDiagnosisDiseaseName) {
		InpatientDiagnosisDiseaseName = inpatientDiagnosisDiseaseName;
	}
	public String getDischarge_date() {
		return Discharge_date;
	}
	public void setDischarge_date(String discharge_date) {
		if (discharge_date.length() < 12 ) {
			discharge_date += " 00:00:00";
		}
		Discharge_date = discharge_date;
	}
	public String getDischarge_Reason() {
		return Discharge_Reason;
	}
	public void setDischarge_Reason(String discharge_Reason) {
		Discharge_Reason = discharge_Reason;
	}
	public String getDischargeCheifDiagnosis() {
		return DischargeCheifDiagnosis;
	}
	public void setDischargeCheifDiagnosis(String dischargeCheifDiagnosis) {
		DischargeCheifDiagnosis = dischargeCheifDiagnosis;
	}
	public String getDischargeCheifDiagnosisName() {
		return DischargeCheifDiagnosisName;
	}
	public void setDischargeCheifDiagnosisName(String dischargeCheifDiagnosisName) {
		DischargeCheifDiagnosisName = dischargeCheifDiagnosisName;
	}
	public String getDepartmentCode() {
		return DepartmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		DepartmentCode = departmentCode;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public String getSickbedNum() {
		return SickbedNum;
	}
	public void setSickbedNum(String sickbedNum) {
		SickbedNum = sickbedNum;
	}
	public String getDoctorCode() {
		return DoctorCode;
	}
	public void setDoctorCode(String doctorCode) {
		DoctorCode = doctorCode;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public String getClinicNum() {
		return ClinicNum;
	}
	public void setClinicNum(String clinicNum) {
		ClinicNum = clinicNum;
	}
	public String getMedicalPaymentTotalAmount() {
		return MedicalPaymentTotalAmount;
	}
	public void setMedicalPaymentTotalAmount(String medicalPaymentTotalAmount) {
		MedicalPaymentTotalAmount = medicalPaymentTotalAmount;
	}
	public String getPlanFundBySI() {
		return PlanFundBySI;
	}
	public void setPlanFundBySI(String planFundBySI) {
		PlanFundBySI = planFundBySI;
	}
	public String getBigDiseaseCompenFee() {
		return BigDiseaseCompenFee;
	}
	public void setBigDiseaseCompenFee(String bigDiseaseCompenFee) {
		BigDiseaseCompenFee = bigDiseaseCompenFee;
	}
	public String getBasicMedTotalFeeAdd() {
		return BasicMedTotalFeeAdd;
	}
	public void setBasicMedTotalFeeAdd(String basicMedTotalFeeAdd) {
		BasicMedTotalFeeAdd = basicMedTotalFeeAdd;
	}
	public String getStandardTotalFeeAdd() {
		return StandardTotalFeeAdd;
	}
	public void setStandardTotalFeeAdd(String standardTotalFeeAdd) {
		StandardTotalFeeAdd = standardTotalFeeAdd;
	}
	public String getPlanFundBySIAdd() {
		return PlanFundBySIAdd;
	}
	public void setPlanFundBySIAdd(String planFundBySIAdd) {
		PlanFundBySIAdd = planFundBySIAdd;
	}
	public String getBigDiseaseCompenFeeAdd() {
		return BigDiseaseCompenFeeAdd;
	}
	public void setBigDiseaseCompenFeeAdd(String bigDiseaseCompenFeeAdd) {
		BigDiseaseCompenFeeAdd = bigDiseaseCompenFeeAdd;
	}
	public String getFeeField1() {
		return FeeField1;
	}
	public void setFeeField1(String feeField1) {
		FeeField1 = feeField1;
	}
	public String getFeeField2() {
		return FeeField2;
	}
	public void setFeeField2(String feeField2) {
		FeeField2 = feeField2;
	}
	public String getFeeField3() {
		return FeeField3;
	}
	public void setFeeField3(String feeField3) {
		FeeField3 = feeField3;
	}
	public String getFeeField4() {
		return FeeField4;
	}
	public void setFeeField4(String feeField4) {
		FeeField4 = feeField4;
	}
	public String getFeeField5() {
		return FeeField5;
	}
	public void setFeeField5(String feeField5) {
		FeeField5 = feeField5;
	}
	public String getFeeField6() {
		return FeeField6;
	}
	public void setFeeField6(String feeField6) {
		FeeField6 = feeField6;
	}
	public String getFeeField7() {
		return FeeField7;
	}
	public void setFeeField7(String feeField7) {
		FeeField7 = feeField7;
	}
	public String getFeeField8() {
		return FeeField8;
	}
	public void setFeeField8(String feeField8) {
		FeeField8 = feeField8;
	}
	public String getFormula() {
		return Formula;
	}
	public void setFormula(String formula) {
		Formula = formula;
	}
	public String getOperator() {
		return Operator;
	}
	public void setOperator(String operator) {
		Operator = operator;
	}
	public String getDistrictCode() {
		return DistrictCode;
	}
	public void setDistrictCode(String districtCode) {
		DistrictCode = districtCode;
	}
	public String getReserveField1() {
		return ReserveField1;
	}
	public void setReserveField1(String reserveField1) {
		ReserveField1 = reserveField1;
	}
	public String getReserveField2() {
		return ReserveField2;
	}
	public void setReserveField2(String reserveField2) {
		ReserveField2 = reserveField2;
	}
	public String getReserveField3() {
		return ReserveField3;
	}
	public void setReserveField3(String reserveField3) {
		ReserveField3 = reserveField3;
	}
	public String getMedicareOfficeApplyFlag() {
		return MedicareOfficeApplyFlag;
	}
	public void setMedicareOfficeApplyFlag(String medicareOfficeApplyFlag) {
		MedicareOfficeApplyFlag = medicareOfficeApplyFlag;
	}
	
	
}
